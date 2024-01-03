package InheritanceMultilevelDemo;

public class StudentExam extends StudentInfo{
    int sub1, sub2, sub3;
    void setMarks(int s1, int s2, int s3){
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    int avg(){
        return (sub1 + sub2 + sub3) / 3;
    }
}
