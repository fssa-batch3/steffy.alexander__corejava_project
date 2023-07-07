package day02.practice;

//declaring a class user

public class User {
	// making the attributes private
	private String id;
	private String name;
	private String password;
	private String emaild;

    //returning the method public so that we can access
	//accessing via methods
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmaild() {
		return emaild;
	}

	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}

	public static void main(String[] args) {
		User user = new User();
		user.setId("A01010");
		user.setName("Steffy");
		user.setPassword("abc23sge");
		user.setEmaild("steffy@gmail.com");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getEmaild());

	}

}
