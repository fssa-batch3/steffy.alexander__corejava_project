package day11;


import java.sql.SQLException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import day11.practice.DAOException;
import day11.practice.TaskDAO;
import day11.practice.Tasks;

public class TaskDAOTest {

		@Test
		public void testCreateTask() throws SQLException{
			Tasks task = new Tasks("steffy","process");
			try {
				Assertions.assertTrue(TaskDAO.createTask(task));
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		@Test
		public void testInvalidCreateTask() throws SQLException{
			try {
				Assertions.assertTrue(TaskDAO.createTask(null));
			} catch (DAOException e) {
				Assertions.assertEquals("cannot run prepared statement", e.getMessage());
//				e.printStackTrace();
			}
		}
}