import java.util.ArrayList;
import java.util.Map;

public class Host extends Profile implements ModifyProfile{
	
	/* Attributes */
	private ArrayList< ArrayList<String> > menu;
	private String promotions;
	private String feedback;
	public int starRatings;
	private String address;
	public Map<String, Integer> timeslot;
	
	/* Methods */
	/* Default constructor */
	public Host() { }
	
	/* Overloaded constructor */
	public Host(String name, String password, String email, String mobile) {
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
	public void updateHostProfile(Map<String, ArrayList<String>> hprofile) {
		
		
	}
	
	public void updatePromotion(ArrayList<String> promos) {
		
	}
	
	public void updateServices(ArrayList<String> services) {

	}
	
	public void setMenu(Map<String, ArrayList<String>> hmap) {
		
	}
	
	public void updateMenu(ArrayList<ArrayList<String>> menu) {
		
	}
	
	
	public void updateAvailability(ArrayList<String availability>) {
		
	}
	
	public int findRating(String restname) {
		
	}
	
 }


