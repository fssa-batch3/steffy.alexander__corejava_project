package day06;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import day06.practice.*;
import java.util.ArrayList;
import java.util.List;

public class FindTasksTest {

    @Test
    public void testFindTaskByName_ExistingTask() {
        List<Tasks1> tasks = new ArrayList<>();
        tasks.add(new Tasks1("task1", 1));
        tasks.add(new Tasks1("task2", 2));
        tasks.add(new Tasks1("task3", 3));

        // Test the findTaskByName method with an existing task name
        boolean result = FindTasks.findTaskByName("task1", tasks);
        assertEquals(true, result);
    }

    @Test
    public void testFindTaskByName_NonExistingTask() {
        List<Tasks1> tasks = new ArrayList<>();
        tasks.add(new Tasks1("task1", 1));
        tasks.add(new Tasks1("task2", 2));
        tasks.add(new Tasks1("task3", 3));

        // Test the findTaskByName method with a non-existing task name
        boolean result = FindTasks.findTaskByName("task4", tasks);
        assertEquals(false, result); // The method should return false for a non-existing task name
    }

    @Test
    public void testFindTaskByName_EmptyList() {
        List<Tasks1> tasks = new ArrayList<>();

        // Test the findTaskByName method with an empty list of tasks
        boolean result = FindTasks.findTaskByName("task1", tasks);
        assertEquals(false, result);
    }
}