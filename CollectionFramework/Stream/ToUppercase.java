package CollectionFramework.Stream;

import java.util.*;

public class ToUppercase {


    public static void main(String[] args) {

        List<String> al = Arrays.asList("paras", "prachi", "khalita", "sitaram");

        al.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

//        System.out.println("Enter the number: ");
//        Scanner sc=new Scanner(System.in);
//
//        int n=sc.nextInt();

    }
}
