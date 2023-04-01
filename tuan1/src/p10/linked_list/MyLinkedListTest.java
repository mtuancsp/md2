package p10.linked_list;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");
        System.out.println(list); // MyLinkedList: a b c d

        // Test get()
        System.out.println(list.get(0)); // a
        System.out.println(list.get(1)); // b
        System.out.println(list.get(2)); // c
        System.out.println(list.get(3)); // d

        // Test addFirst(), addLast(), getFirst(), getLast()
        list.addFirst("z");
        list.addLast("e");
        System.out.println(list); // MyLinkedList: z a b c d e
        System.out.println(list.getFirst()); // z
        System.out.println(list.getLast()); // e

        // Test remove(), removeFirst(), removeLast()
        list.remove(2);
        System.out.println(list.toString()); // MyLinkedList: z a c d e
        System.out.println(list.removeFirst()); // z
        System.out.println(list.toString()); // MyLinkedList: a c d e
        System.out.println(list.removeLast()); // e
        System.out.println(list.toString()); // MyLinkedList: a c d

        // Test clone()
        MyLinkedList list2 = list.clone();
        System.out.println(list2.toString()); // MyLinkedList: a c d
        list2.addLast("e");
        System.out.println(list.toString()); // MyLinkedList: a c d
        System.out.println(list2.toString()); // MyLinkedList: a c d e

        // Test contains() and indexOf()
        System.out.println(list.contains("a")); // true
        System.out.println(list.contains("b")); // false
        System.out.println(list.indexOf("a")); // 0
        System.out.println(list.indexOf("b")); // -1

        // Test isEmpty() and clear()
        System.out.println(list.isEmpty()); // false
        list.clear();
        System.out.println(list.isEmpty()); // true

    }

}

