package p18.racing_car;

public class Main {
    public static final int DISTANCE = 100;
    public static final int STEP = 1;
    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: " + DISTANCE);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
