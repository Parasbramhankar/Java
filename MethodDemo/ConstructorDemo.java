package MethodDemo;

public class ConstructorDemo {
    ConstructorDemo(){  // Default Constructor
        System.out.println("Default constructor ! ! !");
        System.out.println("ConstructorDemo's constructor ! ! !");
    }
    ConstructorDemo(int no1, int no2) {  // Parameterized constructor
        System.out.println("Addition of " + no1 + " + " + no2 + " = " + (no1 + no2));
    }
    ConstructorDemo(double n1, double n2) {  // Parameterized constructor
        System.out.println("Subtraction of " + n1 + " - " + n2 + " = " + (n1 - n2));
    }
    public static void main(String[] args) {
        ConstructorDemo demo1 = new ConstructorDemo();
        ConstructorDemo demo2 = new ConstructorDemo(10, 20);
        ConstructorDemo demo3 = new ConstructorDemo(15.5, 22.7);
    }
}
