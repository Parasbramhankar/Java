package StreamsDemo;

import java.util.ArrayList;

public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(4);
        integers.add(3);
        integers.add(1);
        integers.add(2);

        System.out.println(integers.stream().filter(no -> no % 2 == 0).reduce( 1,(res, i) -> res));
        System.out.println(integers.stream().filter(no -> no % 2 == 0).reduce(2, (res, i) -> res + i));
    }
}
