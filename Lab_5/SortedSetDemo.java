package Lab_5;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> nSet = new TreeSet<>();

        for (String set:nSet) {
            System.out.println("Enter elements of String set: ");
            nSet.add(new Scanner(System.in).next());
        }

        nSet.add("Paras");
        nSet.add("767");
        nSet.add("#%^$5222");

        System.out.println("Tree Set of number Set : ");
        for (String n : nSet)
        {
            System.out.print(n+" ");
        }
    }
}
