package Lab_3.Multilevel_Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Account extends Employee{
    ArrayList<Employee> employee=new ArrayList<>();


    public void createAccount(){

    Employee emp=new Employee();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name of Employee: ");
        emp.setName(sc.nextLine());

        System.out.println("Enter id of Employee: ");
        emp.setId(sc.nextInt());

        System.out.println("Enter Department of Employee");
        String str=sc.nextLine();
        emp.setDepartment(str);

        System.out.println("Enter salary of Employee: ");
        emp.setSalary(sc.nextDouble());

         employee.add(emp);

        System.out.println("Employee's Account created Successfully: ");
        }


        public void printEmployees() {
            List<Employee> highPaidEmp = employee.stream()
                    .filter(employee ->employee.getSalary() > 25000).toList();

            highPaidEmp.forEach(employee-> System.out.println(employee+" "));

        }



    }

