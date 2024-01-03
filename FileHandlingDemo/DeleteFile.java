package FileHandlingDemo;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fd = new File("path");
        if(fd.delete()){
            System.out.println("File " + fd.getName()+ " deleted successfully.");
        }
        else {
            System.out.println("File does not exist ! ! !");
        }
    }
}
