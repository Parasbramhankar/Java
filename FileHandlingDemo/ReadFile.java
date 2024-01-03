package FileHandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File fr = new File("C://TempFile/test.txt");
            Scanner sc = new Scanner(fr);

            while (sc.hasNextLine()){
                String stream = sc.nextLine();
                System.out.println(stream);
            }
            sc.close(); // 10 KB PM (RAM) GC
        }
        catch (FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
