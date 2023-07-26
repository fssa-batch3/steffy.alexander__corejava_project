package day09.practice;

import java.time.LocalDate;
import java.util.*;

		public class TaskSorting2 implements Comparable<TaskSorting2> {
			private int priority;
			private String name;
			private LocalDate deadline;
			
			public TaskSorting2(int priority,String name,LocalDate deadline) {
				
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
			public int compareTo(TaskSorting2 task) {
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
 class TaskSorting {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2022, 1, 8);
		LocalDate d2 = LocalDate.of(2022, 1, 8);
		LocalDate d3 = LocalDate.of(2022, 1, 8);
		
		TaskSorting2 task1 = new TaskSorting2(10, "steffy",d1);
		TaskSorting2 task2 = new TaskSorting2(10, "sri",d2);
		TaskSorting2 task3 = new TaskSorting2(2, "sai",d3);
		
		List<TaskSorting2> tasklist= new ArrayList<TaskSorting2>();
		tasklist.add(task1);
		tasklist.add(task2);
		tasklist.add(task3);
		
		Collections.sort(tasklist);
		
		System.out.println(tasklist);
		
	}
}
