package Lab_2.Area;

public class Sphere implements Shape {
    double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return 4*PI+Math.pow(radius,2);
    }
}
