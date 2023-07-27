package day11.practice;

	import java.sql.*;


	public class TaskDAO {
		

		public static boolean createTask(Tasks task) throws DAOException, SQLException {// User defined Exception
			// Write code here to get connection
			if(task == null) {
				throw new DAOException("cannot run prepared statement");
			}
			String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core"; // url for to connect local database

			String user = "8zqnq0yixqcsbrstp3k8"; // user of local database

			String password = "pscale_pw_oIXHeigKNcbgtMXmpu99k0CbCaUDgwwrzIwRNAbkVx4"; // password of loqcal database
			
			Connection connection=null;
//			try {
				try {
					connection = DriverManager.getConnection(url, user, password);
				} 
			catch (SQLException e) {
				throw new DAOException("cannot create connection");
			}
			// Create insert statement
			String query = "insert into task(name, status) values (?,?)";

			// Execute insert statement
			try {
				PreparedStatement pst = connection.prepareStatement(query);
				pst.setString(1, task.getName());
				pst.setString(2, task.getStatus());
				pst.executeUpdate();
			} 
			catch (SQLException e) {
				
				throw new DAOException("cannot run prepared statement");
			}
			// close connection
			try {
				connection.close();
			} 
			catch (SQLException e) {
				throw new DAOException("cannot close connection");
			}
			System.out.println("Task completed");
			return true;
		}

	}
