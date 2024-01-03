package FileHandlingDemo;

import java.io.*;
//import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File ff = new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\ExceptionHandlingDemo\\text.txt");
            if(ff.createNewFile()){
                System.out.println("File created successfully.");
            }
            else {
                System.out.println("File already exist ! ! !");
            }
        }
        catch (IOException e){
            System.out.println("Error ! ! ! " + e.getMessage());
        }
    }
}
