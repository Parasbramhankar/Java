package InheritanceMultilevelDemo;

public class StudentResult extends StudentExam{
    static int res;
    void result(int res){
        if (res >= 75 && res <= 100){
            System.out.println("Student Got Grade A.");
        } else if (res >= 60 && res < 75) {
            System.out.println("Student Got Grade B.");
        } else if (res >= 40 && res < 60) {
            System.out.println("Student Got Grade C.");
        }else{
            System.out.println("Student Got Grade Fail ! ! ! ");
        }
    }

    public static void main(String[] args) {
        StudentResult studentResult = new StudentResult();
        studentResult.setData(1, "Ravi", "MCA");
        studentResult.getData();
        studentResult.setMarks(20, 20, 32);
        res = studentResult.avg();
        System.out.println("Average " + res);
        studentResult.result(res);
    }
}
