package CollectionFramework.List;

import java.util.*;
import java.util.Scanner;


public class PrimeDescending {
    static boolean checkPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2||num==3){
            return true;
        }
        if(num%2==0||num%3==0){
            return false;
        }

        for(int i=5;i<=Math.sqrt(num);i++){
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        }

        return true;
    }

    ArrayList<Integer> primeNumber(ArrayList<Integer> arrayList){

        ArrayList<Integer>arr=new ArrayList<>();

        for (Integer list:arrayList) {
//            int num=arrayList.get(i);

            if(checkPrime(list)){
                arr.add(list);
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayList<Integer>al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        PrimeDescending primeDescending=new PrimeDescending();

        ArrayList<Integer>prime=primeDescending.primeNumber(al);

//        prime.sort(Collections.reverseOrder());

        System.out.println("Arraylist before sort: "+al);

        System.out.println("ArrayList after sorting: "+prime);

        sc.close();
    }


}


