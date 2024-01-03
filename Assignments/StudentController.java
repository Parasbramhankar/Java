package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentController {
    ArrayList<Student> studentList = new ArrayList();
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);  // This is specifically for String Name
    public void createStudent() {
        // Object must be inside method to create multiple instances
        Student student = new Student();
        System.out.println("Enter name of student : ");
        student.setName(sc1.nextLine());
        System.out.println("Enter Roll Number of student : ");
        student.setRollNo(sc.nextInt());
        System.out.println("Enter marks of student : ");
        student.setMarks(sc.nextDouble());
        studentList.add(student);
        System.out.println("Student created . . .");
    }

    public void getAllStudent(){
        System.out.println("Student count : " + studentList.size());

        System.out.println("..............................................");

        for (Student list : studentList) {
            System.out.println("Student Name : " + list.getName());
            System.out.println("Student Roll No : " + list.getRollNo());
            //System.out.println("Student Marks : " + list.getMarks());
            System.out.println("..............................................");
        }
    }

    // Maximum marks can be found by targeting last index after sorting Arraylist
    public void getMaxMarks() {
        double maxMarks = 0;
        // Maximum marks found by comparing individual marks entity
        for (Student list : studentList) {
            if(list.getMarks() > maxMarks)
                maxMarks = list.getMarks();
        }
        System.out.println("Maximum marks : " + maxMarks);
    }

    // Minimum marks found by targeting 0th index after sorting
    public void getMinMarks() {
        // Sorting By Comparing two objects (Lambda Expression)
        studentList.sort((stu1, stu2) -> (int) (stu1.getMarks() - stu2.getMarks()));
        System.out.println("Minimum marks : " + studentList.get(0).getMarks());
    }
}
