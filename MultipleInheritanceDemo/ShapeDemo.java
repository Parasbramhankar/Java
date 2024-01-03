package MultipleInheritanceDemo;

public class ShapeDemo implements DrawDemo{

    public void draw() {
        System.out.println("This is method from DrawDemo Interface.");
    }
    @Override
    public void drawCircle() {
        System.out.println("This is method from CircleDemo Interface.");
    }
    public void drawSquare() {
        System.out.println("This is method from SquareDemo Interface.");
    }
    public void shape(){
        System.out.println("This is method from Shape Class.");
    }

    public static void main(String[] args) {
        ShapeDemo shapeDemo = new ShapeDemo();
        shapeDemo.drawCircle();
        shapeDemo.drawSquare();
        shapeDemo.draw();
        shapeDemo.shape();
    }
}
