package a1;


public interface IVoteService {
	//sets the question for the iVote Service
	public void setQuestion(Question question);
	
	//Question submitted by student
	public void studentSubmissions(Student student);
	
	//Runs the report for the student
	public void runReport();
}
