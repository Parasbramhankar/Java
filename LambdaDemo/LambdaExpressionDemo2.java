package LambdaDemo;

@FunctionalInterface
interface Draw1{
    public void message();
}

public class LambdaExpressionDemo2 {
    public static void main(String[] args) {
        String msg = "Hello";

        Draw1 draw1 = () -> { System.out.println("Java " + msg); };
        draw1.message();
    }
}
