package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class Tasks1 {// task1,2,3

	public String taskName;

	public int priority;

	public Tasks1(String taskName, int priority) {
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

 class Task {

	public static final String taskName = null;

	public static void main(String[] args) {
		List<Tasks1> tasks = new ArrayList<>();
		// Adding tasks to ArrayList
//			tasks.add("hkuhi");
		tasks.add(new Tasks1("task1", 1));
		tasks.add(new Tasks1("task2", 2));
		tasks.add(new Tasks1("task3", 3));
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println(tasks.get(i).printtaskName());
			System.out.println(tasks.get(i).printpriority());
		}

	}

}
