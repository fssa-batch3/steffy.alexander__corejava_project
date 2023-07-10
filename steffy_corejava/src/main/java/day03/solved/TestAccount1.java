package day03.solved;

class Account1 {

	public String accNo;

	public String name;

	public double balance;

	// Default constructor

	public Account1() {

	}

	public Account1(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		System.out.println(accNo + " " + name + "  " + balance);

	}

}

public class TestAccount1 {

	public static void main(String[] args) {
		// Constructor with variables, its also overloaded.
		Account1 acct1 = new Account1("A101", "Naresh", 1000);

		Account1 acct2 = new Account1("A102", "Arun", 1000);

		Account1 acct3 = new Account1("A103", "Steffy", 5000);

	}

}