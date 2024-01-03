package InterfaceDemo;

@FunctionalInterface
public interface Area {
    void rectangleArea(int l, int b);

    default void message(){
        System.out.println("This is default method from Area Functional Interface.");
    }
}
