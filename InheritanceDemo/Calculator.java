package InheritanceDemo;

import java.util.Scanner;

public class Calculator extends Arithmetic{
    int multiplication(int no1, int no2){
        return no1 * no2;
    }

    double division(int no1, int no2){
        return no1 / no2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter the value of Number 2 : ");
        num2 = sc.nextInt();

        res = calculator.multiplication(num1, num2);
        System.out.println("Result of multiplication : " + res);

        res = calculator.addition(num1, num2);
        System.out.println("Result of addition : " + res);

        System.out.println("Result of subtraction : " + calculator.subtraction(num1, num2));

        System.out.println("Result of division : " + calculator.division(num1, num2));
    }
}
