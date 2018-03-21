import java.util.ArrayList;
import java.util.Map;

public class EndUser extends Profile implements ModifyProfile{

	/* Attributes */
	private ArrayList<String> prefCuisine;
	private String feedback;
	
	/* Methods */
	/* Default constructor */
	public EndUser() {
		
	}
	
	/* Overloaded constructor */
	public EndUser(String name, String password, String email, String mobile) {
		super(name, password, email, mobile);
	}
	
	/* Interface methods */
	@Override
	public void addProfile(String name, String email, String password, String mobile) {
		
	}
	
	@Override
	public void editProfile() {
		
	}
	
	/* Class methods */
	public void updateFilter(Map<String, ArrayList<String> > hmap) {
		
	}
	
	public void giveFeedback() {
		
	}
	
}
