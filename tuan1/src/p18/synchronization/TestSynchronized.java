package p18.synchronization;

public class TestSynchronized {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 myThread1 = new MyThread1(table);
        MyThread2 myThread2 = new MyThread2(table);
        myThread1.start();
        myThread2.start();
    }
}
