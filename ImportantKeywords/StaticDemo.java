package ImportantKeywords;

public class StaticDemo {

    static int a=10;
    int b=30;

    static{
        a=20;
        System.out.println("IN Static Block");
    }

    StaticDemo(){
        System.out.println("In constructor");
        System.out.println("Value of a: "+a);
    }

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();
    }
}
