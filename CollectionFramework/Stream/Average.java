

//Use of reduce method in stream

package CollectionFramework.Stream;

import java.util.*;
public class Average {

    static int average(ArrayList<Integer>arr){

        return (arr.stream().reduce(0,(a,b)->a+b)/arr.size());
    }

    public static void main(String[] args){

        ArrayList<Integer>al=new ArrayList<>();

        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        System.out.println("Average: "+average(al));

        sc.close();

    }
}
