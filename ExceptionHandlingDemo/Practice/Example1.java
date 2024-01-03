package ExceptionHandlingDemo.Practice;

import java.util.*;

public class Example1 {

    public static void arithmeticDivision(int a,int b){

        try{
            System.out.println("Division: "+(a/b));

        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        arithmeticDivision(sc.nextInt(),sc.nextInt());

    }

}
