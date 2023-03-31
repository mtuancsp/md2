package p10.array_list;

public class Test {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        System.out.println("Size of the list: " + list.size());
        System.out.println("List contains apple: " + list.contains("apple"));
        System.out.println("Element at index 1: " + list.get(1));

        MyList<String> clonedList = list.clone();
        System.out.println("Cloned list contains orange: " + clonedList.contains("orange"));

        System.out.println("Index of banana: " + list.indexOf("banana"));

        list.remove(1);
        System.out.println("Element at index 1 after remove: " + list.get(1));

        list.clear();
        System.out.println("Size of the list after clear: " + list.size());
    }
}
