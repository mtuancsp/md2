package p18.even_odd;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.setPriority(10);
        evenThread.setPriority(1);
        oddThread.start();
//        oddThread.join();
        evenThread.start();
    }
}