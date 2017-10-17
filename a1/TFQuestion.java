package a1;

public class TFQuestion implements Question {
	protected String question;
	protected String  options;
	protected String answer;
	
	public TFQuestion(String question, String options, String answer) {
		this.setQuestion(question);
		this.setOptions(options);
		this.setAnswer(answer);		
	}

	@Override
	public void setQuestion(String question) {
		this.question = question;
		
	}

	@Override
	public String getQuestion() {
		
		return question;
	}

	@Override
	public void setOptions(String options) {
		
		this.options = options;
		

	}

	@Override
	public String getOptions() {
		
		return options;

	}

	@Override
	public void setAnswer(String answer) {
		// TODO Auto-generated method stub
		this.answer = answer;

	}

	@Override
	public String getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

}
