package p18;

class MyThread extends Thread
{
    MyThread() {
        System.out.print(" MyThread");
    }

    public void run() {
        System.out.print(" bar");
    }

    public void run(String s) {
        System.out.println(" baz");
    }
}
public class ThreadDemo 
{
    public static void main (String [] args) {
        Thread t = new MyThread() {
            public void run() {
                System.out.println(" foo");
            }
        };
        t.start();
    }
}