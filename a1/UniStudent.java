package a1;

//university student
public class UniStudent implements Student {
	String ID;
	String answer;
	
	public UniStudent(String ID, String answer) {
		this.setID(ID);
		this.setSubmission(answer);
	}

	@Override
	public void setID(String ID) {
		this.ID = ID;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void setSubmission(String answer) {
		this.answer = answer;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSubmission() {
		return answer;
	}

}
