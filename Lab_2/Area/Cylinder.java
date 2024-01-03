package Lab_2.Area;

public class Cylinder implements Shape {
    double r,h;

    public void setData(double r,double h){
    this.r=r;
    this.h=h;

    }
    @Override
    public double area(){
        return ((2*PI*r*h)*2*PI+Math.pow(r,2));
    }
}
