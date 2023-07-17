package day06;


import org.junit.Assert;
import org.junit.Test;

public class TasksValidatorTest {

    @Test
    public void testValidTask() {
        Tasks validTask = new Tasks();
        validTask.setTaskName("Task 1");
        validTask.setPriority(5);

        boolean isValid = TasksValidator.validateTask(validTask);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testEmptyTaskName() {
        Tasks invalidTask = new Tasks();
        invalidTask.setTaskName("");
        invalidTask.setPriority(3);

        boolean isValid = TasksValidator.validateTask(invalidTask);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testNullTaskName() {
        Tasks invalidTask = new Tasks();
        invalidTask.setTaskName(null);
        invalidTask.setPriority(2);

        boolean isValid = TasksValidator.validateTask(invalidTask);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testNonPositivePriority() {
        Tasks invalidTask = new Tasks();
        invalidTask.setTaskName("Task 2");
        invalidTask.setPriority(-1);

        boolean isValid = TasksValidator.validateTask(invalidTask);
        Assert.assertFalse(isValid);
    }
}
