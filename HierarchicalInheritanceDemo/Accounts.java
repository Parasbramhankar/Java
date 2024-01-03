package HierarchicalInheritanceDemo;

public class Accounts extends Employee{
    Accounts(double salary){
        System.out.println("This is Accounts class");
        System.out.println("Salary is : " + salary);
    }

    public static void main(String[] args) {
        Accounts accounts = new Accounts(55000.500);
        accounts.setInfo(202, "Raj", 78965432);
        accounts.getInfo();
    }
}
