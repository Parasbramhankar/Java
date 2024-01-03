package AnonymousDemo;

abstract class MyClass {
    abstract void msg();
}

public class AnonymousTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass() {
            @Override
            void msg() {
                System.out.println("Welcome to anonymous class . . .");
            }
        };
        myClass.msg();
    }
}
