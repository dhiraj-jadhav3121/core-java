package JDBC;

import java.sql.*;

public class MySqlConnections {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            // user --> root ,pass-> Amol@1234
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/academy", "root", "Amol@1234");


            System.out.println("SuccessFully Connected...!");


            statement = connection.createStatement();  // [select * from employee ]


            resultSet = statement.executeQuery(" select * from employees");
            System.out.println("ID \t" + "NAME\t" + "Profile\t" + "\tEmail\t" + "\tSalary\t" + "\tAge\t" + "\texp\t" + "\tpid");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name").trim();
                String profile = resultSet.getString("profile").trim();
                String email = resultSet.getString("email").trim();
                int salary = resultSet.getInt("salary");
                int age = resultSet.getInt("age");
                int exp = resultSet.getInt("exp");
                int pid = resultSet.getInt("pid");

                System.out.println(id + "\t" + name + "\t\t" + profile + "\t\t" + email + "\t" + salary + "\t" + age + "\t" + exp + "\t" + pid);


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
