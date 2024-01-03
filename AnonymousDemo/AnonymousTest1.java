package AnonymousDemo;

interface Test1{
    void disp();
    void msg();
}

public class AnonymousTest1{
    public static void main(String[] args) {
        Test1 objRef = new Test1(){
            @Override
            public void disp() {
                System.out.println("Display method from Test1 Interface . . .");
            }

            @Override
            public void msg() {
                System.out.println("Message method from Test1 Interface . . .");
            }
        };
        objRef.disp();
        objRef.msg();
    }
}
