import java.util.ArrayList;
import java.util.Map;

public class DbManager {
	/* Attributes */
	private ArrayList<String> hostProfileData;
	private ArrayList< ArrayList<String> > menuList; 
	private Map<String, Integer> availSlots;
	private Filter filterData;
	private ArrayList<Feedback> feedback;
	
	/* Methods */
	/* Constructor */
	public DbManager() {
		
	}
	
	/* Overloaded constructor */
	
	/* Class Methods */
	public Filter fetchUserPreferences(String email) {
		
	}
	
	public Feedback fetchUserFeedback(String email) {
		
	}
	
	public Feedback fetchRestaurantFeedback(String email) {
		
	}
	
	public Map<String, Integer> fetchTimeSlots(String restName) {
		
	}
	
	public ArrayList< ArrayList<String> > fetchHostMenu(String restName) {
		
	}
	
	public ArrayList<String> fetchAdvertisement() {
		
	}
	
	public Profile fetchHostProfile(String email) {
		
	}
	
	public Profile fetchUserProfile(String email) {
		
	}
	
	public void saveUserProfile(Profile profile) {
		
	}
	
	public void saveHostProfile(Profile profile) {
		
	}
	
	public void saveAdvertisement( ArrayList<String> adv) {
		
	}
	
	public void savePromotion(ArrayList<String> promo) {
		
	}
	
	public void saveTimeSlots(Map<String,Integer> avail) {
		
	}
	
	public void saveMenu(ArrayList< ArrayList<String> > menu) {
		
	}

    public void saveReservation(String restName, String userTimeSlot, String email) {

    }
}
