package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(11);
        linkedHashSet.add(55);
        linkedHashSet.add(44);
        linkedHashSet.add(22);
        linkedHashSet.add(33);

        for (Integer intg : linkedHashSet) {
            System.out.println(intg);

        }


    }
}
