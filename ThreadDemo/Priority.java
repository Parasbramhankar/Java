package ThreadDemo;

class priority1 extends Thread{
    public void run(){
        System.out.println("I am paras");
    }

}
class priority2 extends Thread{
    public void run(){
        System.out.println("I am Student");
    }
}

public class Priority {
    public static void main(String[] args) {
        priority1 p1 = new priority1();
        priority2 p2 = new priority2();

        p2.setPriority(5);
        p1.setPriority(10);

        p2.start();
        p1.start();


        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
    }

}
