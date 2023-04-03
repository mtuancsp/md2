package p11.queue;

public class MyQueue {
    private final int capacity;
    private final int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int size = 0;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr = new int[capacity];
    }

    public boolean isQueueFull() {
        return size == capacity;
    }

    public boolean isQueueEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            size++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            head++;
            if  (head == capacity - 1) {
                System.out.println("Removed: " + queueArr[head]);
                head = 0;
            } else {
                System.out.println("Removed: " + queueArr[head]);
            }
            size--;
        }
    }


}
