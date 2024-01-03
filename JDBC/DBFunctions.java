package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBFunctions {
    public Connection connect_to_db(String dbUrl, String dbUser, String dbPass) {
        Connection conn = null;
        try {
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                if(conn != null){
                    System.out.println("Connection to DB established.");
                }
                else {
                    System.out.println("Connection to DB failed ! ! !");
                }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void createTable(Connection conn, String tableName){
        Statement statement;
        try {
            String query = "create table " + tableName + "(empid SERIAL, name varchar(50), salary int, primary key(empid));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table " + tableName + " is created.");
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void insertData(Connection conn, String tableName, String empName, int empSalary){
        Statement statement;
        try{
            String query = String.format("insert into %s (name, salary) values('%s', '%d');", tableName, empName, empSalary);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into table : " + tableName);
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
