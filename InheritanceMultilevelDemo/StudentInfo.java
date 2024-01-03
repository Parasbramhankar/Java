package InheritanceMultilevelDemo;

public class StudentInfo {
    int rno;
    String name;
    String branch;
    void setData(int rno, String name, String branch){
        this.rno = rno;
        this.name = name;
        this.branch = branch;
    }

    void getData(){
        System.out.println("Student Roll No. : " + rno);
        System.out.println("Student Name : " + name);
        System.out.println("Student branch : " + branch);
    }
}
