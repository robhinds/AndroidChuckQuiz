package com.tmm.android.chuck.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
	
	private String question;
	private String answer;
	private String option1;
	private String option2;
	private String option3;
	private int rating;
	
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the option1
	 */
	public String getOption1() {
		return option1;
	}
	/**
	 * @param option1 the option1 to set
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	/**
	 * @return the option2
	 */
	public String getOption2() {
		return option2;
	}
	/**
	 * @param option2 the option2 to set
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	/**
	 * @return the option3
	 */
	public String getOption3() {
		return option3;
	}
	/**
	 * @param option3 the option3 to set
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	
	public List<String> getQuestionOptions(){
		List<String> shuffle = new ArrayList<String>();
		shuffle.add(answer);
		shuffle.add(option1);
		shuffle.add(option2);
		shuffle.add(option3);
		Collections.shuffle(shuffle);
		return shuffle;
	}

}
