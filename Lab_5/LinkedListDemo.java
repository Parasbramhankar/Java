package Lab_5;

import java.util.LinkedList;

    public class LinkedListDemo {
        public static void main(String[] args) {
            LinkedList<String> strings = new LinkedList();
            strings.add("Paras");
            strings.add("Bramhankar");
            strings.add("RCOEM");
            strings.add("Arjuni/mor");
            strings.add("VNIT");

            for (String str : strings) {
                System.out.println(str);
            }
//sort
        strings.sort(String::compareTo);
//print
        System.out.println();
        for (String str : strings)
        {
            System.out.println(str);
        }
//Print hashcode
            System.out.println(strings.get(1).hashCode());
            System.out.println(strings.get(3).hashCode());
            System.out.println(strings.get(4).hashCode());

        }
    }


