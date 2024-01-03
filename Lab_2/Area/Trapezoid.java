package Lab_2.Area;

public class Trapezoid  implements Shape {

    public double base1,base2,height;
    public void setData(double base1,double base2,double height){
        this.base1=base1;
        this.base2=base2;
        this.height=height;
    }
    @Override
    public double area(){
        double pre= (base1*base2)/2;
        return pre*height;

    }
}
