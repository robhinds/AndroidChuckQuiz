/**
 * 
 */
package com.tmm.android.chuck.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robert.hinds
 * 
 * This class represents the current game being played
 * tracks the score and player details
 *
 */
public class GamePlay {
	
	private int numRounds;
	private int difficulty;
	private String playerName;
	private int right;
	private int wrong;
	private int round;
	
	private List<Question> questions = new ArrayList<Question>();
	
	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	/**
	 * @return the right
	 */
	public int getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(int right) {
		this.right = right;
	}
	/**
	 * @return the wrong
	 */
	public int getWrong() {
		return wrong;
	}
	/**
	 * @param wrong the wrong to set
	 */
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	/**
	 * @return the round
	 */
	public int getRound() {
		return round;
	}
	/**
	 * @param round the round to set
	 */
	public void setRound(int round) {
		this.round = round;
	}
	/**
	 * @param difficulty the difficulty to set
	 */
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	/**
	 * @param q the question to add
	 */
	public void addQuestions(Question q) {
		this.questions.add(q);
	}
	
	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}
	
	
	public Question getNextQuestion(){
		
		//get the question
		Question next = questions.get(this.getRound());
		//update the round number to the next round
		this.setRound(this.getRound()+1);
		return next;
	}
	
	/**
	 * method to increment the number of correct answers this game
	 */
	public void incrementRightAnswers(){
		right ++;
	}
	
	/**
	 * method to increment the number of incorrect answers this game
	 */
	public void incrementWrongAnswers(){
		wrong ++;
	}
	/**
	 * @param numRounds the numRounds to set
	 */
	public void setNumRounds(int numRounds) {
		this.numRounds = numRounds;
	}
	/**
	 * @return the numRounds
	 */
	public int getNumRounds() {
		return numRounds;
	}
	
	/**
	 * method that checks if the game is over
	 * @return boolean
	 */
	public boolean isGameOver(){
		return (getRound() >= getNumRounds());
	}


}
