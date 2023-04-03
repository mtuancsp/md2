package p11.implement_queue_using_circular_linked_list;

public class Main {

    static class Node {
        int data;
        Node next;
    }

    static class Queue {
        Node front, rear;
    }

    static void enQueue(Queue queue, int data) {
        Node node = new Node();
        node.data = data;
        if (queue.front == null)
            queue.front = node;
        else
            queue.rear.next = node;

        queue.rear = node;
        queue.rear.next = queue.front;
    }

    static int deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.print("empty queue");

        }

        int data;
        if (queue.front == queue.rear) {
            data = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else {
            Node tp = queue.front;
            data = tp.data;
            queue.front = queue.front.next;
            queue.rear.next = queue.front;
        }

        return data;
    }

    // Function displaying the elements
    static void displayQueue(Queue queue) {
        Node node = queue.front;
        System.out.print("Elements in Circular Queue are: ");
        while (node.next != queue.front) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        // Creating a queue
        Queue queue = new Queue();
        queue.front = queue.rear = null;

        // Inserting elements in Circular Queue
        enQueue(queue, 20);
        enQueue(queue, 40);
        enQueue(queue, 60);

        // Display elements
        displayQueue(queue);

        // Deleting elements
        System.out.println(deQueue(queue));
        System.out.println(deQueue(queue));
        System.out.println("AFTER DELETING, ELEMENT LEFT  ");
        // Remaining elements in Circular Queue
        displayQueue(queue);
        System.out.println("AFTER INSERTING NEW VALUE ");
        enQueue(queue, 80);
        displayQueue(queue);
    }
}
