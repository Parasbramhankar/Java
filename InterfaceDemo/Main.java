package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.getArea(5, 7);
        rect.getArea(10);

        System.out.println(rect.operation(10, 5));
    }
}
