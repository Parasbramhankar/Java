package Lab_1.Employee;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Profile {
    ArrayList<Employee>Emp=new ArrayList<>();

    public void createEmp(){
        Employee emp=new Employee();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name of Employee: ");
        emp.setEmpName(sc.nextLine());
        System.out.println("Enter Department of Employee");
        emp.setDepartment(sc.nextLine());
        System.out.println("Enter id of Employee: ");
        emp.setId(sc.nextInt());
        System.out.println("Enter salary of Employee: ");
        emp.setSalary(sc.nextDouble());
        Emp.add(emp);
        System.out.println("Employee's Profile created Successfully: ");
    }

    public void getSalary(int id){
        for (Employee employee:Emp) {
            if(employee.getId()==id){
                System.out.println("Name: "+employee.getName());
                System.out.println("Department: "+employee.getDepartment());
                System.out.println("Salary: "+employee.getSalary());
                exit(0);
            }
        }
        System.out.println("Id does not Exist");
    }
}
