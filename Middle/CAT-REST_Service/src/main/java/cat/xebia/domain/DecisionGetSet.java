package cat.xebia.domain;

import java.io.Serializable;

public class DecisionGetSet implements Serializable {

	private static final long serialVersionUID = -4741633254571866662L;
	String question;
	String answer;
	String level;
	String category;
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
}
