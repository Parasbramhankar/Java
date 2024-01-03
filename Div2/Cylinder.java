package Div2;

import java.util.Scanner;

public class Cylinder implements Shape{
    @Override
    public double area() {
        double res, radius, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder : ");
        radius = sc.nextDouble();;
        System.out.println("Enter the height of cylinder : ");
        height = sc.nextDouble();

        res = 2 * 3.14 * radius * (radius + height);
        return res;
    }
}
