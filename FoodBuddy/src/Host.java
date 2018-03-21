import java.util.ArrayList;
import java.util.Map;

public class Host extends Profile implements ModifyProfile{
	
	/* Attributes */
	private ArrayList< ArrayList<String> > menu;
	private String promotions;
	private String feedback;
	private String paymentType;
	public int starRatings;
	public int likes;
	public int dislikes;
	private String typeOfBussiness;
	private ArrayList<String> cuisinesOffered;
	private String address;
	
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
	public void updateHostProfile(Map<String, ArrayList<String>> hmap, String item) {
		
	}
	
	public void setPromotion(Map<String, ArrayList<String>> hmap) {
		
	}
	
	public void setServices(Map<String, ArrayList<String>> hmap) {

	}
	
	public void setMenu(Map<String, ArrayList<String>> hmap) {
		
	}
	
	public void setAvailabilty(Map<String, ArrayList<String>> hmap) {
		
	}
	
	public void getHostProfile() {
		
	}
	
	public void checkAvailabilty() {
		
	}
	
	public void findRating() {
		
	}
	
 }
