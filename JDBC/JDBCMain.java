package JDBC;

import java.sql.Connection;
import java.util.Scanner;

public class JDBCMain {
    public static void main(String[] args) {
        DBFunctions dbf = new DBFunctions();
        String dbUrl = "jdbc:postgresql://localhost:5432/MCASEM1";
        String dbUser = "postgres";
        String dbPass = "postgres";
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Connection connection = dbf.connect_to_db(dbUrl, dbUser, dbPass);
        // System.out.println("Enter table name");
        // dbf.createTable(connection, sc.next());

        // dbf.insertData(connection, "employee", "Ajinkya", 25000);

        dbf.insertData(connection, sc.next(), sc1.next(), sc1.nextInt());
    }
}