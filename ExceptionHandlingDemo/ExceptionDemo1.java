package ExceptionHandlingDemo;

import java.util.Scanner;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1, no2;
        System.out.println("Enter the value of No1 : ");
        no1 = sc.nextInt();
        System.out.println("Enter the value of No2 : ");
        no2 = sc.nextInt();
        try {
            System.out.println("Division = " + no1 / no2);
        }
        catch(Exception e){
            //System.out.println("Division by Zero is not possible ! ! !");
//            e.printStackTrace();
            System.out.println("Exception : " + e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("Program ended ! ! !");
    }
}
