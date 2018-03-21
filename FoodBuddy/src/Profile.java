
public abstract class Profile {
	
	/* Attributes */
	private String name;
	private String password;
	private String email;
	private String mobile;
	
	/* Default constructor */
	public Profile()
	{
		
	}
	
	/* Overloaded constructor */
	public Profile(String name, String password, String email, String mobile) {
		setName(name);
		setPassword(password);
		setEmail(email);
		setMobile(mobile);
	}
	
	/* Getter Methods */
	public String getName() { return this.name; }
	public String getEmail() { return this.email; }
	public String getPassword() { return this.password; }
	public String getMobile() { return this.mobile; }
	
	/* Setter Methods */
	public void setName(String name) { this.name = name; }
	public void setEmail(String email) { this.email = email; }
	public void setPassword(String password) { this.password = password; }
	public void setMobile(String mobile) { this.mobile = mobile; }
	
	public Profile readProfile(String name) { return null; }
}
