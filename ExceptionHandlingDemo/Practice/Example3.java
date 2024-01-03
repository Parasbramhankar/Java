package ExceptionHandlingDemo.Practice;

public class Example3 {
    public static void help(int a,int b) throws ArithmeticException{

            System.out.println("Inside help()"+a/b);
            throw new ArithmeticException("Error in this function");
    }

    public static void main(String [] args){
        try{
            help(10,9);
        }
        catch(ArithmeticException e){
            System.out.println("this is catch main: "+e.getMessage());
        }
    }
}
