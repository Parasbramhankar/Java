package Lab_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

    public void readFile(){
        try{
            File fr = new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\Lab_3\\Example.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()){
                String stream = sc.nextLine();
                System.out.println(stream);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void writeFile(){
        try{
            FileWriter fw = new FileWriter("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\Lab_3\\Example.txt");
            fw.write("My father name is Sitaram Bramhankar");
            FileDemo f=new FileDemo();
            f.readFile();
            fw.close();
            System.out.println("Successful.");
        }
        catch (IOException e){
            System.out.println("Error : " + e.toString());
        }
    }

    public void deleteFile(){
        File fd = new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\Lab_3\\Example.txt");
        if(fd.delete()){
            System.out.println("File " + fd.getName()+ " deleted successfully.");
        }
        else {
            System.out.println("File does not exist ! ! !");
        }
    }

}
