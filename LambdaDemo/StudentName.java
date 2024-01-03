package LambdaDemo;

import java.util.ArrayList;

public class StudentName {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("John");
        studentList.add("Ravi");
        studentList.add("Tushar");
        studentList.add("Divya");
        studentList.add("Nisha");

        studentList.forEach((nm) -> System.out.println(nm));
    }
}
