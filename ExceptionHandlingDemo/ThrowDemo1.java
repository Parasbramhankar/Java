package ExceptionHandlingDemo;

import java.util.Scanner;

public class ThrowDemo1 {
    public static void validate (int age) {
        if(age < 18){
            throw new ArithmeticException("Person is not eligible for voting ! ! !");
        }
        else {
            System.out.println("Person is eligible for voting ! ! !");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of voter : ");
        int age = sc.nextInt();
        validate(age);
        System.out.println("Program is ended . . .");
    }
}
