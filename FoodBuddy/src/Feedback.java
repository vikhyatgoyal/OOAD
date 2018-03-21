
public class Feedback {
	
	/* Attributes */
	private String fbname;
	private String feedback;
	private int rating;
	private String date;
	
	/* Default constructor */
	public Feedback()
	{
		
	}
	
	/* Overloaded constructor */
	public Feedback(String _fbname, String _feedback, int _rating, String _date) {
		setFbname(_fbname);
		setFeedback(_feedback);
		setRating(_rating);
		setDate(_date);
	}
	
	/* Getter Methods */
	public String getFbname() { return this.fbname; }
	public String getFeedback () { return this.feedback; }
	public int getRating() { return this.rating; }
	public String getDate() { return this.date; }
	
	/* Setter Methods */
	public void setFbname(String fbname) { this.fbname = fbname; }
	public void setFeedback(String feedback) { this.feedback = feedback; }
	public void setRating(int rating) { this.rating = rating; }
	public void setDate(String date) { this.date = date; }
	
}
