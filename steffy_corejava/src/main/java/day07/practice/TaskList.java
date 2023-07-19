package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;



public class TaskList {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();// {task1,task2,...}

        Task task1=new Task(1, "Steffy", "2023-07-20");
        Task task2=new Task(2, "King", "2023-07-20");
        Task task3=new Task(3, "Barath", "2023-05-29");
        Task task4=new Task(3, "madhu", "2023-11-09");
        
        
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4); 

        HashSet<Task> tasksSet = new HashSet<Task>(tasks);// tasks as a arraylist is converted into hashset

        for (Task task : tasksSet) {// 
            System.out.println("Using HashSet: " + task.getId());
            System.out.println("Using HashSet: " + task.getName());
            System.out.println("Using HashSet: " + task.getDeadline());
        }
    }
}

