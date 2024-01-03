package Lab_2.Student;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            TestStudent  ts=new TestStudent();
            Scanner sc=new Scanner(System.in);
            ts.createStudent();
            ts.createStudent();
//            ts.createStudent();
            System.out.println("Highest marks:  "+ts.highMarks());
            System.out.println("Info about high marks: :");
            ts.highStudent();

            System.out.println("Average marks: "+ts.avgMarks());

            System.out.println("All Student: ");
            ts.display();

        }
    }

