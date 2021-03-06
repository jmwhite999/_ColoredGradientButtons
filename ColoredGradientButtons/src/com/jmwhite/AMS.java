package com.jmwhite;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class AMS extends Activity implements OnClickListener {
	private String TAG = "AMS";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "The main activity has started");
        
        View playButton = findViewById(R.id.play_btn);
        playButton.setOnClickListener(this);
        View statsButton = findViewById(R.id.player_data_btn);
        statsButton.setOnClickListener(this);
        View highscoreButton = findViewById(R.id.highscore_btn);
        highscoreButton.setOnClickListener(this);
        View optionsButton = findViewById(R.id.options_btn);
        optionsButton.setOnClickListener(this);   
        View Button5 = findViewById(R.id.btn5);
        Button5.setOnClickListener(this);        
    }
    
	public void onClick(View v) {
		switch(v.getId())
		{
			case R.id.play_btn:
			{
				//Button1
				Toast.makeText(this, "You clicked on the Red Button!", Toast.LENGTH_SHORT).show();
				Intent i = new Intent(this, Game.class);
				startActivity(i);
				break;
			}				
			case R.id.player_data_btn:
			{
				//Button2
				Toast.makeText(this, "You clicked on the Blue Button!", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.highscore_btn:
			{
				//Button3
				Toast.makeText(this, "You clicked on the Purple Button!", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.options_btn:
			{
				//Button 4
				Toast.makeText(this, "You clicked on the Green Button!", Toast.LENGTH_SHORT).show();
				break;
			}	
			case R.id.btn5:
			{
				//Button5
				Toast.makeText(this, "You clicked on the Yellow Button!", Toast.LENGTH_SHORT).show();
				break;
			}
		}		
	}    
    
}