package Lab_4;

import java.util.Scanner;

public class ArithmeticDemo {

    void arithmeticOperation() {

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 Multiplication");
        System.out.println("Press 4 Division");

        Scanner sc=new Scanner(System.in);
        int num;
        int n=sc.nextInt();
        int a=0,b=0;
        switch (n)
        {
            case 1:
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Addition: "+(a+b));
                break;

            case 2:
                 a=sc.nextInt();
                 b=sc.nextInt();
                System.out.println("Subtraction: "+(a-b));
                break;

            case 3:
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("Addition: "+(a*b));
                break;

            case 4:
                a=sc.nextInt();
                b=sc.nextInt();
                try{
                    double res=a/b;
                    System.out.println("Division: "+res);
                }
                catch (ArithmeticException e){

                    System.out.println("Error: "+e.getMessage());

                }
                break;

            default:
                System.out.println("Enter Valid Number...!!");
                break;

        }
    }
}
