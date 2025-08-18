package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Home {

    public Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/academy?useSSL=false";
        String username = "root";
        String password = "Amol@1234";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }

    public void addData(int x, String y, String z) throws Exception {

        Connection c = connect();
        String query = "insert into book values(?,?,?);";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setInt(1, x);
        stmt.setString(2, y);
        stmt.setString(3, z);
        stmt.executeUpdate();
        System.out.println("Book added...");
    }

    public void readById(int n) throws Exception {

        Connection c = connect();
        String query = "select * from book where id = ?;";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setInt(1, n);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString("name") + " written by " + rs.getString("author"));
        }
    }

    public void readAllData() throws Exception {
        Connection c = connect();
        String query = "select * from book;";
        PreparedStatement stmt = c.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString("name") + " written by " + rs.getString("author"));
        }
    }

    public static void main(String[] args) throws Exception {

        Home h = new Home();
        h.addData(4, "Bhaagvat", "Sant Eknath");
        h.readAllData();

    }
}










