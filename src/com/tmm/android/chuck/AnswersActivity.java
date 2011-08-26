/**
 * 
 */
package com.tmm.android.chuck;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.tmm.android.chuck.quiz.GamePlay;
import com.tmm.android.chuck.util.Utility;

/**
 * @author robert.hinds
 *
 */
public class AnswersActivity extends Activity implements OnClickListener {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.answers);
		GamePlay currentGame = ((ChuckApplication)getApplication()).getCurrentGame();
		
		TextView results = (TextView)findViewById(R.id.answers);
		String answers = Utility.getAnswers(currentGame.getQuestions());
		results.setText(answers);
		
		//handle button actions
		Button finishBtn = (Button) findViewById(R.id.finishBtn);
		finishBtn.setOnClickListener(this);
		
	}
	

	
	/* (non-Javadoc)
	 * @see android.app.Activity#onKeyDown(int, android.view.KeyEvent)
	 * 
	 * This method is to override the back button on the phone
	 * to prevent users from navigating back in to the quiz
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		switch (keyCode)
		{
		case KeyEvent.KEYCODE_BACK :
			return true;
		}
		
		return super.onKeyDown(keyCode, event);
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.finishBtn :
			finish();
		}
	}

}
