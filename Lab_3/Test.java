package Lab_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PrimeNumberArrayList pma=new PrimeNumberArrayList();
        EvenOddArrayList eoa=new EvenOddArrayList();

        ArrayList<Integer> arr = new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers you want to insert ?: ");
        int n=sc.nextInt();
//input
        for (int i = 0; i <n; i++) {
            arr.add(sc.nextInt());
        }

//Operation 1
        pma.printNumber(arr);

        System.out.println();
//operation 2
        eoa.evenOdd(arr);
    }
}
