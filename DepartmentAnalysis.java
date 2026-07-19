import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DepartmentAnalysis {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();

        try {
            Statement st = con.createStatement();
            String query = "SELECT department, AVG(performance_rating) AS avg_rating, AVG(salary) AS avg_salary " +
                            "FROM employees GROUP BY department";
            ResultSet rs = st.executeQuery(query);

            System.out.println("=== Department-wise Analysis ===");
            while (rs.next()) {
                String dept = rs.getString("department");
                double avgRating = rs.getDouble("avg_rating");
                double avgSalary = rs.getDouble("avg_salary");

                System.out.println("Department: " + dept);
                System.out.println("Average Performance Rating: " + avgRating);
                System.out.println("Average Salary: " + avgSalary);
                System.out.println("-----------------------------");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}