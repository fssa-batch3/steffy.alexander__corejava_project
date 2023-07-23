package day11.practice;
import java.sql.*;
public class TaskDAO {
	public static void main(String[] args) throws DAOException {
		Tasks task = new Tasks("practice","completed");
		createTask(task);
	}
    public static boolean createTask(Tasks task) throws DAOException {
        if (task == null) {
            throw new DAOException("Cannot run prepared statement. Task is null.");
        }
        String url = "jdbc:mysql://localhost:3306/task";
        String user = "root";
        String password = "123456";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO task(name, status) VALUES (?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(query)) {
                pst.setString(1, task.getName());
                pst.setString(2, task.getStatus());
                pst.executeUpdate();
            }
            System.out.println("Task completed");
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error while creating task", e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new DAOException("Error while closing connection", e);
                }
            }
        }
    }
}