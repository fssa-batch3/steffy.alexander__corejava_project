package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class FindTasks {

	static boolean findTaskByName(String name, List<Task> tasks) {

		for (Task value : tasks) {
			if (value.taskName.equals(name)) {

				System.out.println("found the name");

				return true;
			}
		}
		System.out.println("found not match");

		return false;
	}

	public static void main(String[] args) {

		List<Task> tasks = new ArrayList<>();
		// Adding tasks to ArrayList
		tasks.add(new Task("task1", 1));
		tasks.add(new Task("task2", 2));
		tasks.add(new Task("task3", 3));

		// calling class and its method
		FindTasks.findTaskByName("task1", tasks); // invoke the value

	}
}