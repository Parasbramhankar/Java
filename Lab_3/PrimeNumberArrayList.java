package Lab_3;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class PrimeNumberArrayList {
   public void printNumber(ArrayList<Integer>arr){

        List<Integer> primeNumbers = arr.stream()
                .filter(num -> {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .toList();

        System.out.println("Prime numbers:");
        primeNumbers.forEach(num -> System.out.print(num + " "));
    }
}
