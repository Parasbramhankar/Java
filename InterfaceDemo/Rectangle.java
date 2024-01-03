package InterfaceDemo;

public class Rectangle implements Polygon {
    final double pi = 3.14;
    public void getArea(int length, int breadth){
        System.out.println("Area of rectangle : " + length * breadth );
    }

    public void getArea(int radius){
        System.out.println("Area of Circle : " + pi * radius * radius);
    }

    @Override
    public int operation(int no1, int no2) {
        int res = no1 * no2;
        return res;
    }
}
