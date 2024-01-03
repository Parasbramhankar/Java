package Lab_3.Multilevel_Inheritance;

import java.util.Scanner;

public class TestEmployee extends Account {
    public static void main(String[] args) {
//        Account account = new Account();
        TestEmployee TE =new TestEmployee();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter details of Employee: ");
            TE.createAccount();
            TE.createAccount();

        System.out.println("The Employees whose salary is more than 25k: ");
        TE.printEmployees();

        }

    }

