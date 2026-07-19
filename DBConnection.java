import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/hr_analytics";
            String user = "root";
            String password = "MySQL@123"; // put YOUR MySQL password here
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully!");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return con;
    }
}