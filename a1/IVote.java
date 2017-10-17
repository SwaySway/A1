package a1;

import java.util.*;

public class IVote implements IVoteService {
	private HashMap<String, Student> submissions = new HashMap<String, Student>();
	Question q;
	
	public IVote(Question question) {
		this.setQuestion(question);
	}
	
	@Override
	public void setQuestion(Question question) {
		q = question;
	}

	@Override
	public void studentSubmissions(Student student) {
		
		submissions.put(student.getID(), student);
	}

	@Override
	public void runReport() {
		HashMap<String, Integer> stats = new HashMap<String, Integer>();
		for (Map.Entry<String, Student> entry : submissions.entrySet()) {
		  String studentAnswer = entry.getValue().getSubmission();
		  int valueAnswer = (stats.getOrDefault(studentAnswer, 0)) + 1;
		  stats.put(studentAnswer, valueAnswer);
		}
		System.out.println("Below are the stats");
		for(Map.Entry<String, Integer> entry:stats.entrySet()) {
			System.out.println(entry.getKey()+": "+Integer.toString(entry.getValue()));
		}
		
		
	}

}
