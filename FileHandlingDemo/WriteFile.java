package FileHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\ExceptionHandlingDemo\\text.txt");
            fw.write("My college name is RCOEM. My batch is 2023-24.");
            fw.close();
            System.out.println("File writing operation successful.");
        }
        catch (IOException e){
            System.out.println("Error : " + e.toString());
        }
    }
}
