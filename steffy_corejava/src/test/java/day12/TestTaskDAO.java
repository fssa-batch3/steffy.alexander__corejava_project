package day12;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
import day11.practice.DAOException;
import day12.practice.TaskDAO;
import day12.practice.Tasks;

public class TestTaskDAO {

    
    @Test
    public void testCreateTask() throws DAOException {
        // Create a new Task object with test data
        Tasks task = new Tasks();
        task.name = "Test Task";
        task.status = "New";

        // Call the createTask method
        TaskDAO.createTask(task);

        // Now, you can retrieve the task using getAllTasks and verify if it was created successfully
        List<Tasks> allTasks = TaskDAO.getAllTasks();
        boolean taskFound = false;
        for (Tasks t : allTasks) {
            if (t.name.equals("Test Task") && t.status.equals("New")) {
                taskFound = true;
                break;
            }
        }

        // Assert that the task was found in the list
        assertEquals(true, taskFound);
    }

    @Test
    public void testGetAllTasks() throws DAOException {
        // This test case will check if the getAllTasks method returns a non-empty list
        List<Tasks> allTasks = TaskDAO.getAllTasks();

        // Assert that the list is not null and not empty
        assertEquals(false, allTasks.isEmpty());
    }
}
