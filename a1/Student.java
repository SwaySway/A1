package a1;

public interface Student {
	//Sets the id for said student
	public void setID(String ID);
	
	//Gets id of said student
	public String getID();
	
	//there set of answers for questions
	public void setSubmission(String[] answers);
	
	
	public String[] getSubmissions();
	
}
