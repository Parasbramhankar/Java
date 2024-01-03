package CollectionFramework.List.Practice;


//Average of numbers
import java.util.*;
public class LinkedListDemo1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List<Integer>lList=new LinkedList<>();

        lList.add(sc.nextInt());
        lList.add(sc.nextInt());
        lList.add(sc.nextInt());
        lList.add(sc.nextInt());
        lList.add(sc.nextInt());

        int number=lList.stream().reduce(0,(a,b)->a+b);
        System.out.println((number/lList.size()));

        lList.stream().reduce(0,(a,b)->a+b);

    }
}
