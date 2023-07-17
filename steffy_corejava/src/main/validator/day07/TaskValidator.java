package day07;

public class TaskValidator {
    
    public static boolean validateTask(Task task) {
        if (task.getName() == null || task.getName().isEmpty()) {
            System.out.println("Task name is required.");
            return false;
        }
        
        if (task.getId() <= 0) {
            System.out.println("Invalid task ID. Task ID must be a positive integer.");
            return false;
        }
        
        if (task.getDeadline() == null) {
            System.out.println("Task deadline is required.");
            return false;
        }
        
        return true;
    }
}
