package p18.racing_car.update;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Race {
    private final int distance;
    private final int step;
    private final List<Car> cars;
    private final Map<Car, Integer> positions;
    private final CountDownLatch startLatch;
    private long startTime;

    public Race(int distance, int step, List<Car> cars) {
        this.distance = distance;
        this.step = step;
        this.cars = cars;
        this.positions = new HashMap<>();
        this.startLatch = new CountDownLatch(1);
    }

    public void start() {
        System.out.println("Distance: " + distance);
        for (Car car : cars) {
            positions.put(car, 0);
            new Thread(car).start();
        }
        startLatch.countDown();
        startTime = System.currentTimeMillis();
    }

    public void awaitStart() throws InterruptedException {
        startLatch.await();
    }

    public void updatePosition(Car car, int distance) {
        positions.put(car, distance);
        printPositions();
    }

    public void finish(Car car) {
        long elapsedTime = getElapsedTime();
        System.out.println("Car " + car.getName() + " finished in " + elapsedTime + "s");
        if (allFinished()) {
            System.out.println("Race finished in " + elapsedTime + "s");
        }
    }

    public int getDistance() {
        return distance;
    }

    public int getStep() {
        return step;
    }

    private void printPositions() {
        char[][] raceTrack = new char[cars.size() + 2][distance / step + 2];
        for (char[] row : raceTrack) {
            Arrays.fill(row, ' ');
        }

        Arrays.fill(raceTrack[0], '-');
        Arrays.fill(raceTrack[raceTrack.length - 1], '-');

        for (int i = 1; i < raceTrack.length - 1; i++) {
            raceTrack[i][0] = '|';
            raceTrack[i][raceTrack[0].length - 1] = '|';
        }

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            int position = positions.get(car) / step + 1;
            if (position > raceTrack[0].length - 2) {
                position = raceTrack[0].length - 2;
            }
            raceTrack[i + 1][position] = car.getName().charAt(0);
        }

        StringBuilder sb = new StringBuilder();
        for (char[] row : raceTrack) {
            sb.append(row);
            sb.append('\n');
        }
        System.out.print(sb);
    }




    private boolean allFinished() {
        for (Car car : cars) {
            if (car.getDistance() < distance) {
                return false;
            }
        }
        return true;
    }

    private long getElapsedTime() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime);
    }
}
