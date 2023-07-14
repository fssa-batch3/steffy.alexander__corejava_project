package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, String date) {
		this.id = id;
		this.name = name;
		LocalDate localDate = LocalDate.parse(date);
		this.deadline = localDate;
	}

	public int printId() {
		return id;
	}

	public String printName() {
		return name;
	}

	public LocalDate printDeadline() {
		return deadline;
	}

}
public class TaskList{
	public static void main(String[] args) {
		ArrayList<Task> tasks = new ArrayList<Task>();

		tasks.add(new Task(1, "Steffy", "2023-07-20"));
		tasks.add(new Task(2, "Barath", "2023-05-29"));
		tasks.add(new Task(3, "Barath", "2023-05-29"));
		tasks.add(new Task(3, "madhu", "2023-11-09"));
		
		HashSet<Task> tasks1 = new HashSet<Task>(tasks);
	
		
		for(Task t:tasks1) {
			
			System.out.println("Using Hashset :" + t.printId());
			System.out.println("Using Hashset :" + t.printName());	
			System.out.println("Using Hashset :" + t.printDeadline());	
		}
		
		
	

	}
}

