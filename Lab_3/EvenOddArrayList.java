package Lab_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddArrayList {
    public void evenOdd(ArrayList<Integer> arr)
    {
            List<Integer> evenList = arr.stream()
                    .filter(num -> num % 2 == 0)
                    .map(num -> num + 2)
                    .toList();

            List<Integer> oddList = arr.stream()
                    .filter(num -> num % 2!= 0)
                    .map(num -> num + 3)
                    .toList();

            System.out.println("Even numbers:");
            evenList.forEach(num -> System.out.print(num + " "));

            System.out.println("\nOdd numbers:");
            oddList.forEach(num -> System.out.print(num + " "));

        System.out.println();


        //another
         List<Integer> mList = arr.stream()
            .map(num -> num % 2 == 0 ? num + 2 : num + 3)
            .toList();

        mList.forEach(num-> System.out.print(num+" "));




    }

}

