package Lab_6.SecondNumber;

import java.util.ArrayList;

public class Smallest {

    int findSmallest(ArrayList<Integer> numbers){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (Integer num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;



    }
}
