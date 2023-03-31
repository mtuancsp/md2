package p10.simple_list;

import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void add(E element){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }
}
