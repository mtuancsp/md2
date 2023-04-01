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

    public String toString() {
        String result = "MyLinkedList: ";
        for (int i = 0; i < size; i++) {
            result += get(i) + " ";
        }
        return result;
    }

    private void checkIndex(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException( "Index: " + index + ", Size: " + size);
        }
    }

    //add(int index, Object data)
    public void add(int index, Object data) {
        checkIndex(index);
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node current = head;
            Node newNode = new Node(data);
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }

    }
    //get(int index)
    public Object get(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
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

    //remove( int index)
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index -1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }

    }
    //remove(Object data)
    public boolean remove(Object data) {
        if (head == null) {
            return false;
        } else if (head.data.equals(data)) {
            removeFirst();
            return true;
        } else if (tail.data.equals(data)) {
            removeLast();
            return true;
        } else {
            Node current = head.next;
            Node previous = head;
            while (current != null) {
                if (current.data.equals(data)) {
                    previous.next = current.next;
                    size--;
                    return true;
                }
                previous = current;
                current = current.next;
            }
            return false;
        }
    }

    public Object removeFirst() {
        if (head == null) {
            return null;
        } else {
            Object data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }
    public Object removeLast() {
        if (head == null) {
            return null;
        } else {
            Object data = tail.data;
            tail = tail.next;
            size--;
            return data;
        }
    }

    //clone()
    public MyLinkedList clone() {
        MyLinkedList clone = new MyLinkedList();
        Node current = head;
        while (current!= null) {
            clone.addLast(current.data);
            current = current.next;
        }
        return clone;
    }

    //contains()
    public boolean contains(Object data) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(data)) {
                return true;
            }
        }
        return false;
    }

    //indexOf()
    public int indexOf(Object data) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(data)) {
                return i;
            }
        }
        return -1;
    }

    //isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    //clear()
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

}


