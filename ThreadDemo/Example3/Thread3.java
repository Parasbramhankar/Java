package ThreadDemo.Example3;


import java.util.*;
import java.io.*;
public class Thread3 {

    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread4());
        Thread th2 = new Thread(new Thread4());
        Thread th3 = new Thread(new Thread4());

//        Thread4 th1=new Thread4();
//        Thread4 th2=new Thread4();
//        Thread4 th3=new Thread4();



        th1.setName("th1");
        th2.setName("th2");
        th3.setName("th3");

        th1.start();
        th2.start();
        th3.start();


        try{
            th1.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            th2.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            th3.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
