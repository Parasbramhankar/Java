package Recursion;

import java.util.Scanner;

public class Factorial {
    public static long facto(int no){
        if(no >= 1)
            return no * (facto(no - 1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number : ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " = " + facto(num));
    }
}
