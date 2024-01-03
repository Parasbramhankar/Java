package Lab_2.Area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cylinder cl = new Cylinder();
        System.out.println("Enter Radius and Height of a Cylinder: ");
        cl.setData(sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of Cylinder: "+cl.area());

        Trapezoid tr=new Trapezoid();
        System.out.println("Enter parallel side and height: ");
        tr.setData(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of Trapezoid: "+tr.area());

        Cube cu=new Cube();
        System.out.println("Enter Edge of a Cube: ");
        cu.setData(sc.nextDouble());
        System.out.println("Area of Cube: " +cu.area());

        Sphere sp=new Sphere();
        System.out.println("Enter Radius of Sphere: ");
        sp.setRadius(sc.nextDouble());
        System.out.println("Area of Sphere: "+sp.area());
    }
}
