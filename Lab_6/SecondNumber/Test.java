package Lab_6.SecondNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Largest lr=new Largest();
        Smallest sm=new Smallest();

        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            numbers.add(sc.nextInt());
        }

        int secondSmallest= sm.findSmallest(numbers);
        int secondLargest=lr.findLargest(numbers);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        }
        else {
            System.out.println("The second Largest number is: " +secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest number.");
        }
        else {
            System.out.println("The second smallest number is: " +secondSmallest);
        }

    }
}
