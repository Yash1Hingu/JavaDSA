package OOPS;

public class ObjectClass{
	public static void main(String args[]){
		BankAccount ba = new BankAccount();
		ba.setUsername("Yashhingu");
		// ba.password = "yash@123"; //Error
		ba.setPassword("yash@123");
		System.out.println("Username : "+ba.getUsername()+"\nPassword : "+ba.getPassword());
	}
}

class BankAccount {
	private String username;
	private String password;

	// Setter Function
	public void setUsername(String un) {
		this.username = un;
	}
	public void setPassword(String pwd) {
		this.password = pwd;
	}

	// Getter Functions
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
}