package ExceptionHandlingDemo;

public class MultiCatchDemo1 {
    static int[] list = {11, 22, 33, 44, 55};
    static String name = null;
    static String branch = "MCA";
    static int no1 = 12, no2 = 0;

    public static void main(String[] args) {
        try {
            System.out.println("Division : " + no1 / no2);  //ArithmeticException
            System.out.println("Element of list : " + list[7]);  //ArrayIndexOutOfBoundException
            int i = Integer.parseInt(branch);  //NumberFormatException
            System.out.println("Length of name : " + name.length()); //NullPointerException
        }
        catch (ArithmeticException e) {
            System.out.println("Error of arithmetic operation :- " + e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Error of empty String :- " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error of array index :- " + e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Error of number format :- " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error :- " +e.getMessage());
        }
    }
}
