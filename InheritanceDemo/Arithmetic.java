package InheritanceDemo;

public class Arithmetic {
    int addition(int no1, int no2){
        return no1 + no2;
    }

    int subtraction(int no1, int no2){
        return no1 - no2;
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Addition : " + arithmetic.addition(23, 56) );
        System.out.println("Subtraction : " + arithmetic.subtraction(23, 56) );

    }
}
