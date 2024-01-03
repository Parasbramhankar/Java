package CollectionFramework.List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList();
        strings.add("RCOEM");      //Index 0
        strings.add("VNIT");       //Index 5
        strings.add("YCCE");       //Index 1
        strings.add("VNIT");       //Index 4
        strings.add("Paloti");      //Index 2
        strings.add("Raisonoi");   //Index 3
        strings.add("VNIT");       //Index 6

        for (String str : strings) {
            System.out.println(str);
        }
        Collections.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }



/*
        strings.sort(String::compareTo);

        System.out.println("\n");
        for (String str : strings) {
            System.out.println(str);
    }*/

        System.out.println(strings.get(1).hashCode());
        System.out.println(strings.get(3).hashCode());
        System.out.println(strings.get(6).hashCode());

    }
}
