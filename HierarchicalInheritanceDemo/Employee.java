package HierarchicalInheritanceDemo;

public class Employee {
    int id;
    String name;
    long mobile;

    void setInfo(int id, String name, long mobile){
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }
    void getInfo(){
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Mobile : " + mobile);
    }
}
