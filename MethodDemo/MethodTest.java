package MethodDemo;

import java.util.Scanner;

public class MethodTest {
    public int addition(int n1, int n2) {
        return n1 + n2;
    }
    public int addition(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public double addition(double n1, int n2) {
        return n1 + n2;
    }
    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        Scanner sc = new Scanner(System.in);
        int no1, no2, no3, sum;
        double n1, n2, add;
        System.out.println("Enter the value of Number 1 : ");
        no1 = sc.nextInt();
        System.out.println("Enter the value of Number 2 : ");
        no2 = sc.nextInt();
        System.out.println("Enter the value of Number 3 : ");
        no3 = sc.nextInt();
        sum = test.addition(no1, no2); // Method call
        System.out.println("Addition of " + no1 + " + " + no2 + " = " + sum);
        sum = test.addition(no1, no2, no3);  // Method call
        System.out.println("Addition of " + no1 + " + " + no2 + " + " + no3 + " = " + sum);
        System.out.println("Enter the value of Double Number 1 : ");
        n1 = sc.nextDouble();
        System.out.println("Enter the value of Double Number 2 : ");
        n2 = sc.nextDouble();  // Method call
        add = test.addition(n1, no2);
        System.out.println("Addition of Double " + n1 + " + " + n2 + " = " + add);
    }
}