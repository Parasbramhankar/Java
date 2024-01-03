package FileHandlingDemo;

import java.io.File;

public class ExistsFile {
    public static void main(String[] args) {
        File ff = new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\ExceptionHandlingDemo\\text.txt");
        if(ff.exists()){
            System.out.println("Name of file : " + ff.getName());
            System.out.println("Path of file : " + ff.getPath());
            System.out.println("Size of file : " + ff.length());
        }
        else {
            System.out.println("File does not already exist ! ! !");
        }
    }
}
