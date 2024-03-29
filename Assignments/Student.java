package Assignments;

public class Student {
    private int rollNo;
    private String name;
    private double marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll Number = " + rollNo +
                ", Name = '" + name + '\'' +
                ", Marks = " + marks +
                '}';
    }
}
