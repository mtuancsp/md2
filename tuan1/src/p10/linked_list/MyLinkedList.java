package p10.linked_list;

public class MyLinkedList {

    private int size;
    private Node head;
    private Node tail;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    //add(int index, Object data)
    public void add(int index, Object data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    //get(int index)
    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public Object getFirst() {
        if (head == null) {
            return null;
        } else {
            return head.data;
        }
    }
    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    public Object getLast() {
        if (head == null) {
            return null;
        } else {
            return tail.data;
        }
    }
}


