package com.jmwhite;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Game extends Activity {
	private String TAG = "GAME";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Log.i(TAG, "The game activity has started");
    }   
    
}
