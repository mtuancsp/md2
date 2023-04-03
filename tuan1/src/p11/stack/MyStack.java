package p11.stack;

public class MyStack {
    public int[] arr;
    public int size;
    public int index;

    public MyStack(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index++] = element;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
            return arr[--index];
    }

    public int size(){
        return index;
    }
    public boolean isEmpty() {
        return index == 0;
    }
    public boolean isFull() {
        return index == size;
    }
}
