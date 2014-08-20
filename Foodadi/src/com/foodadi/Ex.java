package com.foodadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Ex extends Activity implements OnClickListener {

	ImageButton food;
	Button want,spec,best,near;
	TextView dish,hotel,love;
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex);
		food=(ImageButton) findViewById(R.id.food);
		dish=(TextView) findViewById( R.id.dish);
		hotel=(TextView) findViewById( R.id.hotel);
		love=(TextView) findViewById( R.id.love);
		want=(Button) findViewById(R.id.want);
		spec=(Button) findViewById(R.id.spec);
		near=(Button) findViewById(R.id.near);
		best=(Button) findViewById(R.id.best);

		want.setOnClickListener(this);
		best.setOnClickListener(this);
		near.setOnClickListener(this);
		spec.setOnClickListener(this);


	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.spec://code for specials
			break;
		case R.id.want://code for adding want
			break;
		case R.id.near://code for nearby
			break;
		case R.id.best://code for best
			break;
			
			
		}
	}

}
