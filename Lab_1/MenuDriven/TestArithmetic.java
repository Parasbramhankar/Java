package Lab_1.MenuDriven;

import java.util.Scanner;

public class TestArithmetic {
    public static void main(String[] args) {
        double no1, no2;
        int choice;
        char op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 for addition : ");
            System.out.println("Enter 2 for subtraction : ");
            System.out.println("Enter 3 for multiplication : ");
            System.out.println("Enter 4 for division : ");
            choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter the 1st number : ");
                    no1 = sc.nextDouble();
                    System.out.println("Enter the 2nd number : ");
                    no2 = sc.nextDouble();
                    System.out.println("Addition of " + no1 + " + " + no2 + " = " + Arithmetic.addition(no1, no2));
                }
                case 2 -> {
                    System.out.println("Enter the 1st number : ");
                    no1 = sc.nextDouble();
                    System.out.println("Enter the 2nd number : ");
                    no2 = sc.nextDouble();
                    System.out.println("Subtraction of " + no1 + " - " + no2 + " = " + Arithmetic.subtraction(no1, no2));
                }
                case 3 -> {
                    System.out.println("Enter the 1st number : ");
                    no1 = sc.nextDouble();
                    System.out.println("Enter the 2nd number : ");
                    no2 = sc.nextDouble();
                    System.out.println("Multiplication of " + no1 + " * " + no2 + " = " + Arithmetic.multiplication(no1, no2));
                }
                case 4 -> {
                    System.out.println("Enter the 1st number : ");
                    no1 = sc.nextDouble();
                    System.out.println("Enter the 2nd number : ");
                    no2 = sc.nextDouble();
                    if(no2 == 0){
                        System.out.println("Division not possible ! ! !");
                        break;
                    }
                    System.out.println("Division of " + no1 + " / " + no2 + " = " + Arithmetic.division(no1, no2));
                }
                default -> {
                    System.out.println("Wrong choice ! ! !");
                }
            }
            System.out.println("Do you want to continue ? ? ?  Y/N");
            while (true) {
                op = sc.next().charAt(0);
                if ((op == 'Y') || (op == 'y') || (op == 'N') || (op == 'n'))
                    break;
                else
                    System.out.println("Enter Y for yes or N for no ! ! !");
            }
        }while(op == 'y' || op == 'Y');
    }
}
