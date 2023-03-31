package p10.linked_list;

public class MyLinkedListTest {

    public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addFirst("a");
    myLinkedList.addFirst("b");
    myLinkedList.addFirst("c");
    myLinkedList.addLast("d");
    myLinkedList.add(1, "e");

    System.out.println(myLinkedList.get(10));


    }
}
