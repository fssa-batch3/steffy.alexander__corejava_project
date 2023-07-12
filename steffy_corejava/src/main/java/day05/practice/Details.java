package day05.practice;

//Creating a class Department
class Department {
	String deptName;
	int deptId;

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

	public void DepDetails() {
		System.out.println("Department Name- " + this.deptName);
		System.out.println("Department Id- " + this.deptId);
	}
}

class Student {
	String name;
	int id;
	Department department;

	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public void StudentDetails() {
		System.out.println("Student Name- " + this.name);
		System.out.println("Student Id- " + this.id);
	}

}

public class Details {
	public static void main(String[] args) {
		Department department = new Department("Biology", 103);
		Student students = new Student("Steffy", 10, department);
		students.StudentDetails();
		department.DepDetails();

	}
}