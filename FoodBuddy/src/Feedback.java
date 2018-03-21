
public class Feedback {
	
	/* Attributes */
	private String name;
	private String feedback;
	private int rating;
	private String date;
	
	/* Default constructor */
	public Feedback()
	{
		
	}
	
	/* Overloaded constructor */
	public Feedback(String name, String password, String email, String mobile) {
		setName(name);
		setPassword(password);
		setEmail(email);
		setMobile(mobile);
	}
	
	
}
