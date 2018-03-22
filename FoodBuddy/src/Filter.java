import java.util.ArrayList;

public class Filter {
	/* Attributes */
	private ArrayList<String> paymentType; 
	private ArrayList<String> services;
	private ArrayList<String> cuisinesOffered; 
	private ArrayList<String> mealType;
	private ArrayList<String> dietRestrictions;
	private int priceRange;
	
	/* Methods */
	public Filter() {
		
	}

    /* Getter methods */
    public ArrayList<String> getPaymentType(){
        return this.paymentType;
    }

    public ArrayList<String> getServices() {
        return this.services;
    }

    public ArrayList<String> getCuisinesOffered() {
        return this.cuisinesOffered;
    }

    public ArrayList<String> getMealType() {
        return this.mealType;
    }

    public ArrayList<String> getDietRestrictions() {
        return this.dietRestrictions;
    }

    /* Setter methods */
    public void setPaymentType(ArrayList<String> payment) {
        this.paymentType = payment;
    }
    
    public void setServices(ArrayList<String> services) {
        this.services = services;
    }
    
    public void setCusinesOffered(ArrayList<String> cuisines) {
        this.cuisinesOffered = cuisinesOffered;
    }
    
    public void setMealType(ArrayList<String> meal) {
        this.mealType = meal;
    }
    
    public void setDietRestrictions(ArrayList<String> dietRestrictions) {
        this.dietRestrictions = dietRestrictions;
    }

}
