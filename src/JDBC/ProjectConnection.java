package JDBC;

import java.sql.*;

public class ProjectConnection {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/academy", "root", "Amol@1234");

            System.out.println("SuccessFully Connected.");

            statement = connection.createStatement();


            resultSet = statement.executeQuery(" select * from project");
            System.out.println("P_ID " + "P_NAME" + "P_Duration");

            while (resultSet.next()) {

                int p_id = resultSet.getInt("p_id");
                String p_name = resultSet.getString("p_name").trim();
                String p_Duration = resultSet.getString("p_Duration").trim();


                System.out.println(p_id + p_name + p_Duration);


            }

            System.out.println(resultSet);


        } catch (Exception ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());

        }
        resultSet.close();
        statement.close();
        connection.close();


    }
}

