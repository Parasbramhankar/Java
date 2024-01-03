package FileHandlingDemo.Practice;

import java.io.*;
public class CreateFile {

    public static void main(String []args){
        try{
            File file1=new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\FileHandlingDemo\\Practice\\text1.txt");
            File file2=new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\FileHandlingDemo\\Practice\\text2.txt");

                    if(file1.createNewFile()){
                        System.out.println("File is created successful");
                    }
                    else{
                        System.out.println("File already exists");
                    }
                 file2.createNewFile();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
