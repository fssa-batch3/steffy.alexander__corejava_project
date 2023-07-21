package day07.practice;

import java.time.LocalDate;


public class Task {

		    private int id;
		    private String name;
		    private LocalDate deadline;

		    public Task(int id, String name, String date) {
		        this.id = id;
		        this.name = name;
		        LocalDate localDate = LocalDate.parse(date);
		        // parse is used for converting string to localdate -- format("2023-07-20")
		        this.deadline = localDate;
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
		}
