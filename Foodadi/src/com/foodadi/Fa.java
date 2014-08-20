package com.foodadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Fa extends Activity implements OnClickListener {
	ImageButton ffood;
	Button ffb;
	TextView fdish,fhotel,flove;
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fa);
		ffood=(ImageButton) findViewById(R.id.ffood);
		fdish=(TextView) findViewById( R.id.fdish);
		fhotel=(TextView) findViewById( R.id.fhotel);
		flove=(TextView) findViewById( R.id.flove);
		ffb=(Button) findViewById(R.id.feed);
		ffb.setOnClickListener(this);
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
		case R.id.feed:break;
		}
	}

}
