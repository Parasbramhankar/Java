package Lab_6;

import java.util.HashMap;
import java.util.Scanner;

class Prime {
    static Boolean isPrime(int num)
    {
        if(num<=0){
            return false;
        }
        if(num==2 || num==3){
            return  true;
        }

        if(num%2==0 || num%3==0){
            return false;
        }

        for(int j=5;j<Math.sqrt(num);j=j+6){
            if(num%j==0||num%(j+2)==0){
                return false;
            }
        }
        return true;
    }
    void checkPrime(HashMap<Integer,Integer>IntMap)
    {

        for (int i = 0; i < IntMap.size(); i++)
            {
                int num = IntMap.get(i);

                if (isPrime(num))
                {
                    System.out.print(num+" ");
                }
           }
    }

}
public class PrimeNoMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> PrimeHashMap = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            PrimeHashMap.put(i,sc.nextInt());
        }
        Prime pr=new Prime();
        pr.checkPrime(PrimeHashMap);

    }
}
