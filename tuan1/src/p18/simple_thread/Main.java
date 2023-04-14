package p18.simple_thread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator(1);
        NumberGenerator generator2 = new NumberGenerator(2);

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}