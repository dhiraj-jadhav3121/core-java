package JDBC;

import java.sql.*;

public class Home123 {

         public Connection connect() throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/home?useSSL=false";
            String username = "root";
            String password = "Amol@1234";
            Connection c = DriverManager.getConnection(url, username, password);
            return c;
        }
        public void dataAdd(int x , String y , String z)throws Exception{
             Connection c= connect();
             String query = "insert into book values (?,?,?) ;";
            PreparedStatement stmt = c.prepareStatement(query);
            stmt.setInt(1,x);
            stmt.setString(2 ,y);
            stmt.setString(3 , z);
            stmt.executeUpdate();
            System.out.println("Booked Added");

            }
    public void readById(int n) throws Exception {

        Connection c = connect();
        String query = "select * from book where id = ?;";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setInt(1,n);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getString("name") + " written by " + rs.getString("author"));
        }


        }

    }

