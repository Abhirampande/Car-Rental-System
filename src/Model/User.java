package Model;

public abstract class User {
	
	private int Id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	
	public User() {
		
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int NewId) {
		Id = NewId;
	}
	
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String NewfirstName) {
		firstName = NewfirstName;
	}
	
	
	public String getlastName() {
		return lastName;
	}
	public void setLastName(String newlastName) {
		lastName = newlastName;
	}
	
	
	public String getemail() {
		return email;	
	}
	public void setemail(String Newemail) {
		email = Newemail;
	}
	
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(String NewphoneNumber) {
		phoneNumber = NewphoneNumber;
	}
	
	
	public String getpassword() {
		return password;
	}
	public void setpassword(String NewPassword) {
		password = NewPassword;
	}
	
	
	public abstract void showList();
	 
}
