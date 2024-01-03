package LambdaDemo;

public class LambdaExpressionDemo1 implements Draw{

    public void display() {
        System.out.println("Display method from Draw interface . . .");
    }

    public static void main(String[] args) {
        LambdaExpressionDemo1 expressionDemo1 = new LambdaExpressionDemo1();
        expressionDemo1.display();
    }
}
