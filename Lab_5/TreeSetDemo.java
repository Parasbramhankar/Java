package Lab_5;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> sSet = new TreeSet<>();
        sSet.add(12);
        sSet.add(23);
        sSet.add(2344);
        sSet.add(1239990000);

        System.out.println("Tree Set of String Set : ");
        for (Integer s : sSet) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("Integer Set : " + (sSet));

        System.out.println("Integer Set in descending order : " + sSet.descendingSet());
    }
}
