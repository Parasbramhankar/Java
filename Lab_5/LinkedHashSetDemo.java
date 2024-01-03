package Lab_5;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        System.out.println("Enter any number: ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//add
        for (int i = 0; i <n; i++) {
            linkedHashSet.add(sc.nextInt());
        }
//print
        for (Integer lh:linkedHashSet) {
            System.out.print(lh+" ");
        }

    }
}
