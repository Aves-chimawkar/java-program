import java.sql.*;
import java.util.Scanner;

public class EmployeeGUI {

    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stmt = conn.createStatement();

            // Create table if it doesn't exist
            String createTableSql = "CREATE TABLE IF NOT EXISTS employees " +
                    "(id INT NOT NULL AUTO_INCREMENT, " +
                    "name VARCHAR(255), " +
                    "age INT, " +
                    "salary DOUBLE, " +
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(createTableSql);

            // Menu loop
            boolean done = false;
            while (!done) {
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");

                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter name:");
                        String name = scanner.next();
                        System.out.println("Enter age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter salary:");
                        double salary = scanner.nextDouble();

                        String insertSql = "INSERT INTO employees (name, age, salary) " +
                                "VALUES ('" + name + "', " + age + ", " + salary + ")";
                        stmt.executeUpdate(insertSql);
                        System.out.println("Employee added.");
                        break;
                    case 2:
                        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
                        while (rs.next()) {
                            System.out.println("ID: " + rs.getInt("id") +
                                    ", Name: " + rs.getString("name") +
                                    ", Age: " + rs.getInt("age") +
                                    ", Salary: " + rs.getDouble("salary"));
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID of employee to update:");
                        int idToUpdate = scanner.nextInt();
                        System.out.println("Enter name (leave blank to keep current):");
                        String nameToUpdate = scanner.next();
                        System.out.println("Enter age (leave blank to keep current):");
                        String ageToUpdate = scanner.next();
                        System.out.println("Enter salary (leave blank to keep current):");
                        String salaryToUpdate = scanner.next();

                        String updateSql = "UPDATE employees SET ";
                        if (!nameToUpdate.isEmpty()) {
                            updateSql += "name = '" + nameToUpdate + "', ";
                        }
                        if (!ageToUpdate.isEmpty()) {
                            updateSql += "age = " + ageToUpdate + ", ";
                        }
                        if (!salaryToUpdate.isEmpty()) {
                            updateSql += "salary = " + salaryToUpdate + ", ";
                        }
                        updateSql = updateSql.substring(0, updateSql.length() - 2);
                        updateSql += " WHERE id = " + idToUpdate;

                        stmt.executeUpdate(updateSql);
                        System.out.println("Employee updated.");
                        break;
                    case 4:
                        System.out.println("Enter ID of employee to delete:");
                        int idToDelete = scanner.nextInt();
                        String deleteSql = "DELETE FROM employees WHERE id = " + idToDelete;
                        stmt.executeUpdate(deleteSql);
                        System.out.println("Employee deleted.");
                        break;
                    case 5:
                        done = true;
                        break;
            }

        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}