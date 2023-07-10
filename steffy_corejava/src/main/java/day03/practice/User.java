package day03.practice;

class User {

	private String name;
	private String password;
	private String emailId;
	
	// Default constructor
	public User() {

	}

	public User(String name, String password, String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
		System.out.println(name + " " + password + "  " + emailId);

	}

	public static void main(String[] args) {
		// Constructor with variables, its also overloaded.
		User user = new User("Steffy", "as12345", "steffy@gmail.com");
		User user1 = new User("Steffy", "abc12345", "steffy@gmail.com");

	}
}
