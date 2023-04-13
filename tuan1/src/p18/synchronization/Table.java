package p18.synchronization;

public class Table {
    void printTable(int n){
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
