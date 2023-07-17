package day07;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class TaskValidatorTest {

    @Test
    public void testValidTask() {
        Task validTask = new Task();
        validTask.setName("Task 1");
        validTask.setId(1);
        validTask.setDeadline(LocalDate.parse("2023-07-20"));

        boolean isValid = TaskValidator.validateTask(validTask);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testEmptyTaskName() {
        Task invalidTask = new Task();
        invalidTask.setName("");
        invalidTask.setId(2);
        invalidTask.setDeadline(LocalDate.parse("2023-05-29"));

        boolean isValid = TaskValidator.validateTask(invalidTask);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testNegativeTaskId() {
        Task invalidTask = new Task();
        invalidTask.setName("Task 3");
        invalidTask.setId(-3);
        invalidTask.setDeadline(LocalDate.parse("2023-11-09"));

        boolean isValid = TaskValidator.validateTask(invalidTask);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testNullTaskDeadline() {
        Task invalidTask = new Task();
        invalidTask.setName("Task 4");
        invalidTask.setId(4);
        invalidTask.setDeadline(null);

        boolean isValid = TaskValidator.validateTask(invalidTask);
        Assert.assertFalse(isValid);
    }
}
