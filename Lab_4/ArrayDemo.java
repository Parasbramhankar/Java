package Lab_4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<>();

    public void acceptElements() {

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
    }
    public void accessElement() {
        System.out.println("Enter index to find the elements : ");
        int ind = sc.nextInt();
        try {
            System.out.println("Element at " + ind + ": " + al.get(ind));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception : " + e.getMessage());
        }
    }

    }

