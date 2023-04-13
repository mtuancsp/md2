package p18.mainthread;

public class Main extends Thread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Thread hiện tại: " + thread.getName());

        thread.setName("CodeGym");
        System.out.println("Sau khi đổi tên: " + thread.getName());

        System.out.println("Độ ưu tiên của Main thread: " + thread.getPriority());

        thread.setPriority(MAX_PRIORITY);

        System.out.println("Độ ưu tiên của Main thread hiện tại: " + thread.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }



        ChildThread childThread = new ChildThread();

        System.out.println("Độ ưu tiên của Child thread: " + childThread.getPriority());

        childThread.setPriority(MIN_PRIORITY);

        System.out.println("Độ ưu tiên của Child thread hiện tại: " + childThread.getPriority());

        childThread.start();
    }
}
