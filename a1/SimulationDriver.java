package a1;

import java.util.*;

public class SimulationDriver {
	

	public static void main(String[] args) {
		Random rng = new Random();
		Question currentQuestion;
		int currentID = 0;
		int rngNum = 0;
		if(rng.nextInt(2) == 0) {
			currentQuestion = new MultiChoiceQuestion("Question?", "A B C D", "C");
		}else {
			currentQuestion = new TFQuestion("T or F?", "1.Right 2.Wrong", "1.Right");
		}
		
		IVoteService voteService = new IVote(currentQuestion);
		String[] options = currentQuestion.getOptions();
		Student currentStudent;
		for(int i = 0; i < 50; i++) {
			currentID = rng.nextInt(10000);
			rngNum = rng.nextInt(options.length);
			currentStudent = new UniStudent(String.valueOf(currentID), options[rngNum]);
			voteService.studentSubmissions(currentStudent);
		}
		
		voteService.runReport();
	}

}
