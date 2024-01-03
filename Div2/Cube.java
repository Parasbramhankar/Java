package Div2;

import java.util.Scanner;

public class Cube implements Shape{
    @Override
    public double area() {
        double side;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of cube :");
        side = scanner.nextDouble();
        return (6 * (side * side));
    }
}
