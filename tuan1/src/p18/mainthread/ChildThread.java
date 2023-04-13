package p18.mainthread;

public class ChildThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
        }
    }
}
