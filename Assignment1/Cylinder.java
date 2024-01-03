package Assignment1;

import java.util.Scanner;

public class Cylinder implements Shape{

    @Override
    public double area() {
        Scanner sc = new Scanner(System.in);
        double radius, height;
        System.out.println("Enter radius of cylinder : ");
        radius = sc.nextDouble();
        System.out.println("Enter height of cylinder : ");
        height = sc.nextDouble();
        double res = 2 * 3.14 * radius * height;
        return res;
    }
}
