package CollectionFramework.Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(22);
        treeSet.add(33);
        treeSet.add(22);
        treeSet.add(11);
        treeSet.add(5);
        treeSet.add(5);

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

    }
}
