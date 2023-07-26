package day07;


import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

import day07.practice.*;

public class TaskListTest {
	
	@Test
	public void testTaskList() {
		ArrayList<Task> tasks = new ArrayList<>(); 
		Task task1 = new Task(1, "Steffy", "2023-07-20");
		Task task2 = new Task(2, "Barath", "2023-05-29");
		Task task3 = new Task(3, "Barath", "2023-05-29");
		Task task4=new Task(3, "madhu", "2023-11-09");
		
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);

		
		HashSet<Task> tasksSet = new HashSet<>(tasks);

		Assert.assertEquals(4, tasksSet.size()); 
	
		Assert.assertTrue(tasksSet.contains(task1));
		Assert.assertTrue(tasksSet.contains(task2));
		Assert.assertTrue(tasksSet.contains(task3));
		Assert.assertTrue(tasksSet.contains(task4));
	}
}
