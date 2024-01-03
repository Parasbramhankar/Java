package CollectionFramework.Map;

import Assignments.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, "John");
        linkedHashMap.put(2, "Ram");
        linkedHashMap.put(4, "Ravi");
        linkedHashMap.put(3, "Divya");
        linkedHashMap.put(5, "Varun");

        System.out.println(linkedHashMap);
    }
}
