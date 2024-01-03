package Lab_2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    ArrayList<Student> students=new ArrayList<>();
    public void createStudent() {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's detail: ");
        System.out.println("Enter Name of Student: ");
        st.setName(sc.nextLine());
        System.out.println("Enter Roll Number: ");
        st.setRoll(sc.nextInt());
        System.out.println("Total Marks: ");
        st.setMarks(sc.nextInt());

        students.add(st);
        System.out.println("New Student's detail Added");
    }

    double max=0;
    public double highMarks() {

        for (Student list : students) {
            double m1 = list.getMarks();
            if (max < m1) {
                max = m1;
            }
        }
        return max;
    }
    public void highStudent(){
        for (Student list:students) {
            double m1=list.getMarks();
            if(list.getMarks()==max){
                System.out.println("Name of Student: "+list.getName());
                System.out.println("Roll Number: "+list.getRoll());
            }
        }

    }

    public double avgMarks(){
        double sum=0;
        for (Student list:students) {
            sum = sum + list.getMarks();
        }
        return sum/students.size();
    }

    public void display(){
        for (Student list:students) {
            System.out.println("Student Name: " + list.getName());
            System.out.println("Roll number: " + list.getRoll());
        }
    }
}