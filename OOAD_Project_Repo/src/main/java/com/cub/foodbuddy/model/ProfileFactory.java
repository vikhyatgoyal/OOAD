public class ProfileFactory {
	
	public ProfileFactory() {
	    }
	
	public Profile CreateProfile(String type, String firstName, String lastName, String contactNumber , String email, String password)
		{
			Profile pr = null;
			
			if (type.equals(“host”))  {

				pr = new Host(String firstName, String lastName, String contactNumber ,String email, String password);
				pr.addProfile(ArrayList< ArrayList<String> > menu, String promotions, String feedback, String address, int starRatings, Map<String, Integer> timeSlots);
								
			}
			
			else if (type.equals(“enduser”)) {

				pr = new EndUser(String firstName, String lastName, String contactNumber , String email, String password);
			    pr.addProfile(ArrayList<String> prefCuisine);
			
			}
			
			else if (type.equals(“admin”)) {
				
				pr = new Admin(String firstName, String lastName, String contactNumber , String email, String password);
			    pr.addProfile(String advertisement, String theme);
			    
			}
			    return pr;
		}
	
}