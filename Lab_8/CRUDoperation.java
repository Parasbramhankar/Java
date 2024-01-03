package Lab_8;

import javax.naming.Name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUDoperation {

    public Connection connectTODB(String dburl, String dbUser, String dbPass) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(dburl, dbUser, dbPass);
            if (conn != null) {
                System.out.println("Connection establish");
            } else {
                System.out.println("Connection to DB fail");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void createTable(Connection conn, String tableName) {
        Statement statement;
        try {
            String query = "create table " + tableName + "(rollNo int, name varchar(50), branch varchar(50), marks int,primary key(rollNo));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table " + tableName + " is created.");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void insertData(Connection conn, String tableName, int rollNo, String name, String branch, int marks) {
        Statement statement;
        try {
            String query = String.format("insert into %s (rollNo, name, branch, marks) values('%d', '%s','%s', '%d');", tableName, rollNo, name, branch, marks);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into table : " + tableName);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    public void deleteRow(Connection conn, String tableName, int roll) {
        Statement statement;
        try {
            String query = String.format("DELETE FROM %s  WHERE rollNo<12", tableName, roll);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row deleted from table : " + tableName);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

        public void updateValue(Connection conn,String tableName, String studName, int roll){
            Statement statement;
            try {
                String query = String.format("UPDATE %s SET name = '%s' WHERE rollNo = '%d' ", tableName, studName, roll);
//              String query=String.format("UPDATE '%s'\n"+"SET name = '%s'\n" +"WHERE rollNo = '%d'",tableName,studName,roll);
                statement = conn.createStatement();
                statement.executeUpdate(query);
                System.out.println("value updated successfully: " + tableName);
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }


        }
}







