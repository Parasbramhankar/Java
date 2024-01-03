package Assignments;

import java.util.Scanner;

public class StudentService {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner sc  = new Scanner(System.in);
        System.out.println("How many students you want to create ? ? ? ");
        int count = sc.nextInt();

        while (count > 0){
            studentController.createStudent();
            count--;
        }

        studentController.getAllStudent();
        studentController.getMaxMarks();
        studentController.getMinMarks();
    }
}
