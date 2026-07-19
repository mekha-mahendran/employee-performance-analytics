import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        if (con != null) {
            System.out.println("Yes! Connected to database.");
        } else {
            System.out.println("Connection failed.");
        }
    }
}