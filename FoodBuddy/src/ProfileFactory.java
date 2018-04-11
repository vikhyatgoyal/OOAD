public class ProfileFactory {
	
	public ProfileFactory() {
	    }
	
	public Profile CreateProfile(String type, String firstName, String lastName, String contactNumber , String address)
		{
			Profile pr = null;
			
			if (type.equals(“host”))

				pr = new Host(String firstName, String lastName, String contactNumber , String address);

			else if (type.equals(“enduser”))

				pr = new EndUser(String firstName, String lastName, String contactNumber , String address);
			
			else if (type.equals(“admin”))
				
				pr = new Admin(String firstName, String lastName, String contactNumber , String address);

			return pr;
		}
	
}