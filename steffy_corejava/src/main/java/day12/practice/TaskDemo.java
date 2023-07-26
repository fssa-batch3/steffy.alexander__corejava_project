package day12.practice;

import java.util.List;

import day11.practice.DAOException;

public class TaskDemo {
	public static void main(String[] args) throws DAOException {
		Tasks task = new Tasks();
		task.name ="practice";
		task.status="process";
		TaskDAO.createTask(task);

		List<Tasks> allTasks = TaskDAO.getAllTasks();
		for (Tasks t : allTasks) {
			System.out.println("ID: " + t.id + ", Name: " + t.name + ", Status: " + t.status);
		}

	}
}