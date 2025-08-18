package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {


    public static void main(String[] args) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/academy?createDatabaseIfNotExist=true";
        String username = "root";
        String password = "Amol@1234";

        Connection c = DriverManager.getConnection(url, username, password);

        if (c != null){
            System.out.println("Database connected...");

            //   String query = "insert into book values (1 , 'wings of wire' , 'Dr. Apj');";

            //    String query = "update book set author = 'Dr . APJ Abdul Kalam' ;";

            String query = "delete from book where id = 1;";

        PreparedStatement stmt = c.prepareStatement(query);
        stmt.executeUpdate();

           // System.out.println("books added..!");
           // System.out.println("book updates..!");
            System.out.println("Book updates..!");



    }else
            System.out.println("Database NOT connected...");
    }
}

