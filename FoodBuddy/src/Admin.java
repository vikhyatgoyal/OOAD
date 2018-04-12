
public class Admin extends Profile implements ModifyProfile{
	
	/* Attributes */
	private String advertisement;
	private String theme;
	
	/* Methods */
	/* Default constructor */
	public Admin() {
		
	}
	
	/* Overloaded constructor */
	public Admin(String name, String password, String email, String mobile) {
		super(name, password, email, mobile);
	}
	
	/* Interface methods */
	@Override
	public void addProfile(String advertisement, String theme) {
		
	}
	
	@Override
	public void editProfile() {
		
	}
	
	/* Class methods */
	public void deleteProfile(String email) {
		/* Search the profile that matches the given email id and delete it */
	}
	
	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
}
