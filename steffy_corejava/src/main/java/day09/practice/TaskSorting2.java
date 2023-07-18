package day09.practice;

import java.time.LocalDate;
import java.util.*;

		class Tasks implements Comparable<Tasks> {
			private int priority;
			private String name;
			private LocalDate deadline;
			
			public Tasks(int priority,String name,LocalDate deadline) {
				
				this.priority = priority;
				this.name = name;
				this.deadline = deadline;
			}
			public int getPriority() {
				return priority;
			}
			public void setPriority(int id) {
				this.priority = priority;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public LocalDate getDeadline() {
				return deadline;
			}
			public void setDeadline(LocalDate deadline) {
				this.deadline = deadline;
			}
			
			
			@Override
			public int compareTo(Tasks task) {
				if (deadline.equals(task.getDeadline())) {
					if(priority == task.priority) {
						return 0;
					}
					else if(priority < task.priority){
						return -1;
					}
					else {
						return 1;
					}
				} 
				else {
					if (deadline.isAfter(task.getDeadline())) {
						return 1;
					} else {
						return -1;
					}
			
				}
			}
			@Override
			public String toString() {
				return "priority=" + priority + ", name=" + name + ", deadline=" + deadline + "\n";
			}
			
			
			
			
		
		}
public class TaskSorting2 {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2022, 1, 8);
		LocalDate d2 = LocalDate.of(2022, 1, 8);
		LocalDate d3 = LocalDate.of(2022, 1, 8);
		
		Tasks task1 = new Tasks(10, "steffy",d1);
		Tasks task2 = new Tasks(10, "sri",d2);
		Tasks task3 = new Tasks(2, "sai",d3);
		
		List<Tasks> tasklist= new ArrayList<Tasks>();
		tasklist.add(task1);
		tasklist.add(task2);
		tasklist.add(task3);
		
		Collections.sort(tasklist);
		
		System.out.println(tasklist);
		
	}
}
