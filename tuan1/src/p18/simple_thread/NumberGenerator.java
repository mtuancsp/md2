package p18.simple_thread;

public class NumberGenerator implements Runnable {
    int num;
    NumberGenerator(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "." + i + " - " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


