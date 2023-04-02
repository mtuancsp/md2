package p11.linked_list_queue;

class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node node = new Node(key);
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node node = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return node;
    }

}
