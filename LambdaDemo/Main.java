package LambdaDemo;

public class Main {
    public static void main(String[] args) {
        ReturnLength Rl=(a,b,c)->a;

        System.out.println("a: "+Rl.length(10,20,30));

    }

}
