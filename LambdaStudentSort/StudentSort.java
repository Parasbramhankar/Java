package LambdaStudentSort;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        students.add(new Student(15, "Dhruv", 45.6));
        students.add(new Student(11, "Tushar", 78.8));
        students.add(new Student(14, "Kunal", 88.8));
        students.add(new Student(12, "Ravi", 55.5));
        students.add(new Student(13, "Ritu", 66.6));

        System.out.println("Before Sorting :");

        for (Student stu : students) {
            System.out.println("Roll No. : " + stu.rno + " Name : " + stu.name +" Marks : " +  stu.marks);
        }

        Collections.sort(students,(s1, s2) -> {return s1.name.compareTo(s2.name);});

        System.out.println("After Sorting :");
        for (Student stu : students) {
            System.out.println("Roll No. : " + stu.rno + " Name : " + stu.name +" Marks : " +  stu.marks);
        }



    }
}
