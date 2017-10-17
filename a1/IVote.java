package a1;
/**
 * @author Josue Ruiz
 * Version 1.0
 * 
 */

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
		//uses a hashmap to compare the results of different students
		HashMap<String, Integer> stats = new HashMap<String, Integer>();
		for (Map.Entry<String, Student> entry : submissions.entrySet()) {
		  String studentAnswer = entry.getValue().getSubmission();
		  int valueAnswer = (stats.getOrDefault(studentAnswer, 0)) + 1;
		  stats.put(studentAnswer, valueAnswer);
		}
		//displays correct answer and then shows the stats
		System.out.println("The correct answer is "+ q.getAnswer());
		System.out.println("Below are the stats");
		for(Map.Entry<String, Integer> entry:stats.entrySet()) {
			System.out.println(entry.getKey()+": "+Integer.toString(entry.getValue()));
		}
		
		
	}

}
