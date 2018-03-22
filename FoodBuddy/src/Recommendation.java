import java.util.ArrayList;
import java.util.Map;

public class Recommendation{

	/*Class attributes*/
	public ArrayList<String> hostNameList;
	public Feedback userFeedback;
	public ArrayList<Feedback> hostFeedback;
	public ArrayList< Map<String,String> > recommendationList;

	/*Methods*/

	/*Default constructor*/
	public Recommendation (){

	}
	/*Called from  EndUser class*/
	public ArrayList<String> getRecommendation(Map<String, String> filter, String email){

	}

	/*Generates recommendation from algorithm*/
	private ArrayList<String> generateRecomendation(){

	}

	/*Used by the algorithm to generate recommendations*/
	public ArrayList< Map<String,String>> getHostList(){

	}

 
}
