package Lab_5;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("Enter any number: ");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//add
        for (int i = 0; i <n; i++) {
            stack.add(sc.nextLine());
        }
//print
        for (String st:stack) {
            System.out.println(st);
        }
        System.out.println("Operation: ");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}