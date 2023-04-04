package p12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 30);
        hashMap.put("Mike", 28);
        hashMap.put("Bill", 32);
        hashMap.put("Maria", 27);

        System.out.println("Display entries in the HashMap");
        System.out.println(hashMap + "\n");


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("John", 30);
        treeMap.put("Mike", 28);
        treeMap.put("Bill", 32);
        treeMap.put("Maria", 27);

        System.out.println("Display entries in the TreeMap");
        System.out.println(treeMap + "\n");


        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
