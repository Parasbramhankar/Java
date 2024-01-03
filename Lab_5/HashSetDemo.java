package Lab_5;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Integer> inSet = new HashSet<>();
        System.out.println("Enter size: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            inSet.add(sc.nextInt());
        }
        inSet.add(1);
        inSet.add(2);
        inSet.add(54);
        inSet.add(1342);
        inSet.add(23);

        for (Integer no : inSet) {
            System.out.println(no);
        }

        System.out.println("Is empty ! " + inSet.isEmpty());
//        check Availabily
        System.out.println("Check available ! " + inSet.contains(1));

       inSet.remove(12);

        inSet.removeAll(inSet);
        System.out.println("Is empty ! " + inSet.isEmpty());

        for (Integer no : inSet) {
            System.out.println(no);
        }
    }
    }

