/**
 * 
 */
package com.tmm.android.chuck.quiz;


import com.tmm.android.chuck.R;


/**
 * @author robert.hinds
 *
 */
public class Helper {

	/**
	 * This method selects a end game response based on the players score
	 * and current difficulty level
	 * 
	 * @param numCorrect - num correct answers
	 * @param numRounds - number of questions
	 * @param diff - the difficulty level
	 * @return String comment
	 */
	public static String getResultComment(int numCorrect, int numRounds, int diff)
	{
		String comm="";
		int percentage = calculatePercentage(numCorrect, numRounds);
		switch (diff)
		{
		case Constants.EXTREME :
			if (percentage > 90){
				comm = "You downloaded the Intersect!";
			}else if (percentage >= 80){
				comm="Nicely Done!";
			}else if (percentage >= 60){
				comm="Not too bad..";
			}else if (percentage >= 40){
				comm="Well, don't give up..";
			}else{
				comm="Next time, stay in the car..";
			}
			break;
			
		default:
			if (percentage > 90){
				comm = "Awesome!";
			}else if (percentage >= 80){
				comm="Nicely Done!";
			}else if (percentage >= 60){
				comm="Not too bad..";
			}else if (percentage >= 40){
				comm="Well, don't give up..";
			}else{
				comm="Next time, stay in the car..";
			}
		}
		
		return comm;
	}
	
	
	/**
	 * Method to return an image to use for the end of game screen
	 * 
	 * @param numCorrect - number of correct answers
	 * @param numRounds - number of rounds
	 * @param diff - difficulty level
	 * @return int Image ID
	 */
	public static int getResultImage(int numCorrect, int numRounds, int diff){
		//calculate percentage
		int percentage = calculatePercentage(numCorrect, numRounds);
		
		//work out which image
		if (percentage > 90){
			if (diff == Constants.EXTREME){
				return R.drawable.hard_winner;
			}else{
				return R.drawable.easy_winner;
			}
		}else if (percentage >= 80){
			return R.drawable.prettygood;
		}else if (percentage >= 60){
			return R.drawable.notbad;
		}else if (percentage >= 40){
			return R.drawable.tryagain;
		}else{
			return R.drawable.loser;
		}
	}
	

	/**
	 * Calculate the percentage result based on the number correct and number of questions
	 * 
	 * @param numCorrect - number of questions right
	 * @param numRounds - total number of questions
	 * @return int percentage correct
	 */
	private static int calculatePercentage(int numCorrect, int numRounds) {
		double frac = (double)numCorrect/(double)numRounds;
		int percentage = (int) (frac*100);
		return percentage;
	}
}
