//Write a program in java to demonstrate a use of thread
//create 3 threads
//1st thread with sleep time 1000 ms
//2nd thread with sleep time 2000 ms
//3rd thread with sleep time 3000 ms

package ThreadDemo.Example_1;

public class Thread1{
    public static void main(String[]args){
        Thread2 th1=new Thread2();
        Thread2 th2=new Thread2();
        Thread2 th3=new Thread2();

        th1.setName("th1");
        th2.setName("th2");
        th3.setName("th3");

        th1.start();
        try{
            th1.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        th2.start();
        try{
            th2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        th3.start();
        try{
            th3.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}