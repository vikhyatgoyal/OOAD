
public abstract class Profile {
	
	/* Attributes */
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String mobile;
	
	/* Default constructor */
	public Profile()
	{
		
	}
	
	/* Overloaded constructor */
	public Profile(String name, String email, String password, String mobile) {
		setName(name);
		setEmail(email);
		setPassword(password);
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

    /* Class methods */
	public Profile readProfile(String email) { return null; }
}
