package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Task1 implements Comparable<Task1> {
	
	private int id;
	private String name;
	private LocalDate deadline;

	public Task1(int id, String name, String deadline) {
		
		this.id = id;
		this.name = name;
		LocalDate date= LocalDate.parse(deadline);
		this.deadline = date;

	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}



	public LocalDate getDeadline() {
		return deadline;
	}

    @Override
	public int compareTo(Task1 a) {
    	
		if (deadline == a.getDeadline()) {
			return 0;
		} 
		else if (deadline.compareTo(a.getDeadline())>0) {
			return 1;
		} else {
			return -1;
		}
	}
}
public class Task{
	public static void main(String[] args) {
		
		Task1 acct1 = new Task1(3,"Coding","2022-10-22");  
		Task1 acct2 = new Task1(5,"Product Design","2022-10-01");
		Task1 acct3 = new Task1(1,"Software Design", "2022-10-07");
		Task1 acct4 = new Task1(3,"Coding","2022-10-22");
		
		ArrayList<Task1> list = new ArrayList<>();
		
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);
		list.add(acct4);
		
		
		Collections.sort(list);
		
     for(Task1 v: list) {
    	 
    	 System.out.println(v.getId()+","+v.getName()+","+ v.getDeadline());
     }
     
		
		
	}
	
}
