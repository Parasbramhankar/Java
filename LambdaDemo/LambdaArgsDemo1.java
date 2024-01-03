package LambdaDemo;

public class LambdaArgsDemo1{
    public static void main(String[] args) {
        Addition add1 = (int n1, int n2) -> (n1 + n2);
        System.out.println("Addition :" + add1.add(12, 34));

        Addition add2 = (n1, n2) -> (n1 + n2);
        System.out.println("Addition :" + add2.add(55, 66));

    }
}
