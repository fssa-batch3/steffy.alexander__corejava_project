package day06.practice;

import java.util.ArrayList;
import java.util.List;

class Task {// task1,2,3

	public String taskName;

	public int priority;

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;

	}

	public String printtaskName() {

		return taskName;
	}

	public int printpriority() {
		return priority;
	}
}

public class Task1 {

	public static void main(String[] args) {
		List<Task> tasks = new ArrayList<>();
		// Adding tasks to ArrayList
//			tasks.add("hkuhi");
		tasks.add(new Task("task1", 1));
		tasks.add(new Task("task2", 2));
		tasks.add(new Task("task3", 3));
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println(tasks.get(i).printtaskName());
			System.out.println(tasks.get(i).printpriority());
		}

	}

}
