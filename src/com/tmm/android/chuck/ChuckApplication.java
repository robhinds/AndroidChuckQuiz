/**
 * 
 */
package com.tmm.android.chuck;

import com.tmm.android.chuck.quiz.GamePlay;

import android.app.Application;

/**
 * @author rob
 *
 */
public class ChuckApplication extends Application{
	private GamePlay currentGame;

	/**
	 * @param currentGame the currentGame to set
	 */
	public void setCurrentGame(GamePlay currentGame) {
		this.currentGame = currentGame;
	}

	/**
	 * @return the currentGame
	 */
	public GamePlay getCurrentGame() {
		return currentGame;
	}
}
