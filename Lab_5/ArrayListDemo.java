package Lab_5;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();

        System.out.println("Enter any number: ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//add
        for (int i = 0; i <n; i++) {
            al.add(sc.nextInt());
        }
//print
        for (Integer arr:al) {
            System.out.print(arr);
        }
        System.out.println();
//        isEmpty
        if(al.isEmpty()){
            System.out.println("List is Empty");
        }
        else {
            System.out.println("List is not Empty");
        }
//Maximum
        System.out.println("Maximum value in Arraylist: "+ Collections.max(al));
//reverse
        Collections.reverse(al);

        Iterator<Integer> it = al.iterator();
        System.out.println("List After reverse: ");
        while(it.hasNext()){
            int i = it.next();
            System.out.print(i+" ");
        }


    }

}
