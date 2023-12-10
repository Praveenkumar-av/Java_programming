// Retrieving data from MySQL database using JDBC.

import java.sql.*;

class ConnectMysql
{
    public static void main(String args[]) throws Exception
    {
        // Register the driver
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univ?user=root&password=2077");

        // create a SQL statement
        Statement stmt = con.createStatement();

        // Execute the statement
        ResultSet rs = stmt.executeQuery("select * from student");

        // retrieve from ResultSet and display column data
        while(rs.next())
        {
            System.out.print(rs.getInt(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.println(rs.getString(4));
        }

        // update the table using executeUpdate() method - create, update and delete table
        int n = stmt.executeUpdate("UPDATE univ.student SET Section='IT' WHERE rollno=241");
        System.out.println("No. of rows affected :"+n);

        // close connection
        con.close();
    }
}