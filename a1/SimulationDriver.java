package a1;
/**
 * @author Josue Ruiz
 * Version 1.0
 * 
 */
import java.util.*;

public class SimulationDriver {
	

	public static void main(String[] args) {
		Random rng = new Random();
		Question currentQuestion;
		int currentID = 0;
		int rngNum = 0;
		//randomly creates question whether it is true/false or multiple choice
		if(rng.nextInt(2) == 0) {
			currentQuestion = new MultiChoiceQuestion("Question?", "A B C D", "C");
		}else {
			currentQuestion = new TFQuestion("T or F?", "1.Right 2.Wrong", "1.Right");
		}
		//initializes iVote Service
		IVoteService voteService = new IVote(currentQuestion);
		String[] options = currentQuestion.getOptions();
		Student currentStudent;
		for(int i = 0; i < 50; i++) {
			currentID = rng.nextInt(10000);
			rngNum = rng.nextInt(options.length);
			currentStudent = new UniStudent(String.valueOf(currentID), options[rngNum]);
			voteService.studentSubmissions(currentStudent);
		}
		//runs the report
		voteService.runReport();
	}

}
