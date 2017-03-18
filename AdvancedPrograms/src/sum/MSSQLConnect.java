package sum;

import java.sql.*;

/**
 * Created by Sai Krishna on 30-06-2016.
 */
public class MSSQLConnect {

    public static void main(String[] args) throws SQLException {

        String dbURL = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=Personal;user=sa;password=Samsung@9070";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
            }
            Statement stmt = conn.createStatement();
            String sql ="select * from dbo.First_Table";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.println(rs.getString(2));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
