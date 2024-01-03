package ExceptionHandlingDemo;

public class NestedTryDemo1 {
    public static void main(String[] args) {
        int[] nos = {12, 45, 32, 4, 2, 0};

        try {
            int no1 = nos[1], no2 = nos[5];
            try {
                System.out.println("Division :- " + no1 / no2);
            }
            catch (ArithmeticException e){
                System.out.println("Divide by zero exception : " + e.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception : " + e.getMessage());
        }
        finally {
            System.out.println("This is a demo program for nested try block.");
        }
        System.out.println("Program ended . . .");
    }
}
