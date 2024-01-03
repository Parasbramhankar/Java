package CollectionFramework.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Double> hashSet = new HashSet();
        hashSet.add(12.2);
        hashSet.add(22.2);
        hashSet.add(33.2);
        hashSet.add(44.2);
//        Collections.sort(hashSet);
        System.out.println(hashSet);
        for (Double dod : hashSet) {
            System.out.println(dod);
        }
        System.out.println("Size : " + hashSet.size());
    }
}
