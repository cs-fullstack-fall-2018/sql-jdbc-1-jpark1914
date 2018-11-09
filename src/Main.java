import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Connection connection = DriverManager.getConnection("jdbc:sqlite:TeachClass");
        Statement stmt=connection.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT FirstName, ClassName FROM Teachers " +
                "LEFT JOIN Classes " +
                "ON Teachers.ClassID = Classes.ClassID");

        while(resultSet.next())
        {
            System.out.print(resultSet.getString("FirstName"));
            System.out.print(" ");
            System.out.print(resultSet.getString("ClassName"));
            System.out.println(" ");


        }

        stmt.close();
        connection.close();

    }
}
