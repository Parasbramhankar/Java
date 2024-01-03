package Lab_2.Area;

public class Cube implements Shape {
    double edge;
    public void setData(double edge){
        this.edge=edge;
    }
    @Override
    public double area(){
        return 6*Math.pow(edge,2);
    }
}
