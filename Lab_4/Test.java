package Lab_4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter 1 for File Operation: ");
        System.out.println("Enter 2 for Arithmetic Operation: ");
        System.out.println("Enter 3 for array Operation: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                FileDemo fd=new FileDemo();
                fd.readFile();
                fd.writeFile();
                fd.deleteFile();
                break;
            case 2:
                ArithmeticDemo ad=new ArithmeticDemo();
                ad.arithmeticOperation();
                break;
            case 3:
                ArrayDemo a=new ArrayDemo();
                a.acceptElements();
                a.accessElement();
                break;
            default:
                System.out.println("Enter Valid Number...!!");
                break;

        }
    }
}


