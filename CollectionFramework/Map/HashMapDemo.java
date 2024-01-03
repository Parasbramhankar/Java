package CollectionFramework.Map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> stringHashMap = new HashMap<>();

        stringHashMap.put(1, "Honda");
        stringHashMap.put(2, "TVS");
        stringHashMap.put(5, "Hero");
        stringHashMap.put(9, "Suzuki");
        stringHashMap.put(4, "Bajaj");

        System.out.println(stringHashMap);

    }
}
