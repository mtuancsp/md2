package p18.synchronization;

public class TestAnonymousClass {
    public static void main(String[] args) {
        Table table = new Table();
        Thread myThread1 = new Thread(() -> table.printTable(5));

        Thread myThread2 = new Thread(() -> table.printTable(100));

        myThread1.start();
        myThread2.start();
    }
}
