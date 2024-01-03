package ExceptionHandlingDemo.Practice;

public class Example2 {
    public static void help(int a,int b){

        try{
            System.out.println("Inside help()");
            throw new ArithmeticException("Error in this function");
        }
        catch(ArithmeticException e){
            System.out.println("Inside help catch");
            throw e;
        }
    }

    public static void main(String [] args){

        try{
            help(10,0);
        }
        catch(ArithmeticException e){
            System.out.println("this is catch main: "+e.getMessage());
        }
    }
}
