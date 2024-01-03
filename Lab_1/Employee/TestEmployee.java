package Lab_1.Employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {

        Profile pr = new Profile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of Employee: ");
        pr.createEmp();

        System.out.println("Enter Id of Employee: ");
        int id=sc.nextInt();
        pr.getSalary(id);

    }
}