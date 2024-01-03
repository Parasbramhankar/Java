package CollectionFramework.Map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap();
        treeMap.put(1, 10);
        treeMap.put(4, 70);
        treeMap.put(5, 40);
        treeMap.put(2, 20);
        treeMap.put(3, 30);

        System.out.println(treeMap);

    }
}
