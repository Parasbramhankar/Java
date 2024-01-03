package Lab_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CRUDoperation dbf = new CRUDoperation();
        String dbUrl = "jdbc:postgresql://localhost:5432/MCASEM1";
        String dbUser = "postgres";
        String dbPass = "Paras@12345";
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Connection connection = dbf.connectTODB(dbUrl, dbUser, dbPass);


//         dbf.createTable(connection, "Student");

//        dbf.insertData(connection, "Student", 11, "Pradeep", "MCA", 99);
//        dbf.insertData(connection, "Student", 12, "Paras", "CSE", 67);
//        dbf.insertData(connection, "Student", 13, "Akhil", "MTech", 91);
//        dbf.deleteRow(connection, "Student", 13);
        dbf.updateValue(connection,"Student","nikhil1",12);


//        dbf.insertData(connection, sc.next(), sc1.next(), sc1.nextInt());
    }
}
