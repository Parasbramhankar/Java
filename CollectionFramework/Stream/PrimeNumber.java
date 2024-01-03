package CollectionFramework.Stream;

import java.util.*;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String []args){
        ArrayList<Integer> al=new ArrayList<>();

        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);

        int no=sc.nextInt();

        for(int i=0;i<no;i++){
            al.add(sc.nextInt());
        }

//        al.stream().filter(n->{
//            if(n<=1){
//                return false;
//            }
//            if(n==2||n==3){
//                return true;
//            }
//            if(n%2==0||n%3==0){
//                return false;
//            }
//            for(int i=5;i<=Math.sqrt(n);i=i+6){
//                if(n%i==0||n%(i+2)==0){
//                    return false;
//                }
//            }
//            return true;
//        }).sorted(Comparator.reverseOrder()).forEach(System.out::println);



//        List<Integer> arr=al.stream().filter(n->{
//            if(n<=1){
//                return false;
//            }
//            if(n==2||n==3){
//                return true;
//            }
//            if(n%2==0||n%3==0){
//                return false;
//            }
//            for(int i=5;i<=Math.sqrt(n);i=i+6){
//                if(n%i==0||n%(i+2)==0){
//                    return false;
//                }
//            }
//            return true;
//        }).sorted(Comparator.reverseOrder()).toList();
//
//        System.out.println(arr);



    }

}
