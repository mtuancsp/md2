package p18.racing_car;

import static p18.racing_car.Main.DISTANCE;
import static p18.racing_car.Main.STEP;

public class Car implements Runnable{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        //khởi tạo điểm, thời gian bắt đầu
        int ranDistance = 0;
        long startTime = System.currentTimeMillis();

        while (ranDistance < DISTANCE) {
            try {
                int speed = (int) (Math.random() * 20 + 1);
                //Vẽ đường xe đã đi
                String log = "|";
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (i < ranDistance) {
                        log += "=";
                    } else if (i == ranDistance) {
                        log += name;
                    } else {
                        log += " ";
                    }
                }
                log += "|";
                System.out.println(log + " " + Math.min(DISTANCE, ranDistance) + "km");
                String line2 = "------------------------------------------------------------------------------------------------------";
                System.out.println(line2);
                Thread.sleep(1000);

                ranDistance += speed;

            } catch (InterruptedException e) {
                System.out.println("Car " + name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + name + " finish in " + (endTime - startTime)/1000 + "s");
    }
}
