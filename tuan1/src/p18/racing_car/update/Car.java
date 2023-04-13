package p18.racing_car.update;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Car implements Runnable {
    private final String name;
    private final Race race;
    private int distance;

    public Car(String name, Race race) {
        this.name = name;
        this.race = race;
        this.distance = 0;
    }

    @Override
    public void run() {
        try {
            race.awaitStart();
            while (distance < race.getDistance()) {
                int speed = (new Random()).nextInt(19) + 1;
                distance += speed;
                race.updatePosition(this, distance);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("Car " + name + " broken...");
        } finally {
            race.finish(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}