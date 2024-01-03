package CollectionFramework.List.Practice;

import java.util.*;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());
        al.add(sc.nextInt());

        System.out.println("Even Numbers are ");

        al.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
