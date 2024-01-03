package ExceptionHandlingDemo;

public class ExceptionDemo2 {
    static String name ;

    public static void main(String[] args) {

        try{
            System.out.println("Length of string is : " + name.length());
        }
        catch(NullPointerException e){
            System.out.println("String is empty ! ! !");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        finally {
            System.out.println("This is finally block . . .");
        }
        System.out.println("End of the Program . . .");
    }
}
