package FileHandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteWithOutOverWriting {
        public static void main(String[] args) {
            try{
                File fr = new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\FileHandlingDemo\\Practice\\text1.txt");
//                Scanner sc = new Scanner(fr);
//                StringBuilder sb=new StringBuilder();
//                while (sc.hasNextLine()){
//                    sb.append(sc.nextLine());
//
//                }
//
//                sc.close();
//                System.out.println(sb);
//                Scanner sc1=new Scanner(System.in);
//                System.out.println("Enter String to WRITE IN file: ");
//                sb.append(sc1.nextLine());

                File fl=new File("C:\\Users\\paras\\OneDrive\\Desktop\\Code\\JavaCode\\com.Java\\src\\ExceptionHandlingDemo\\Practice\\tex2.txt");
//                fl.write(sb.toString());
//                fl.close();

                ;

            }
            catch (FileNotFoundException e){
                System.out.println("Error : " + e.getMessage());
            }
            catch (IOException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }


