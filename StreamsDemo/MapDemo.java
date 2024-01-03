package StreamsDemo;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(22);
        integers.add(37);
        integers.add(38);
        integers.add(45);
        integers.add(11);
        integers.add(66);
        integers.add(32);

        List<Integer> addOn = integers.stream().map(no -> (no + no)).toList();
        System.out.println("Original List : " + integers);
        System.out.println("OddOn List : " + addOn);

        List<Boolean> evenList = integers.stream().map(n -> (n % 2 == 0)).toList();
        System.out.println("Even List : " + evenList);

        List<Integer> listEven = integers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("List of even elements : " + listEven);

        List<Integer> sortedList = integers.stream().sorted().toList();
        System.out.println("Sorted List : " + sortedList);

    }
}
