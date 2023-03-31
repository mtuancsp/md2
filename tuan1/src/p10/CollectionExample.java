package p10;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next().toUpperCase() + " ");
//        }

        for (String s : collection) {
            System.out.print(s.toUpperCase() + " ");
        }
    }
}

