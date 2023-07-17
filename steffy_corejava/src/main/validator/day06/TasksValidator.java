package day06;

public class TasksValidator {
    
    public static boolean validateTask(Tasks task) {
        if (task.getTaskName() == null || task.getTaskName().isEmpty()) {
            System.out.println("Task name is required.");
            return false;
        }
        
        if (task.getPriority() <= 0) {
            System.out.println("Priority must be a positive integer.");
            return false;
        }
        
        return true;
    }
}

