package com.foodadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mo extends Activity implements OnClickListener {
	Button us,app,fb,tw,feed,rec,rate,err;
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mo);
		us=(Button) findViewById(R.id.us);
		app=(Button) findViewById(R.id.app);
		fb=(Button) findViewById(R.id.fb);
		tw=(Button) findViewById(R.id.tw);
		feed=(Button) findViewById(R.id.feed);
		rec=(Button) findViewById(R.id.rec);
		rate=(Button) findViewById(R.id.rate);
		err=(Button) findViewById(R.id.er);
		us.setOnClickListener(this);
		app.setOnClickListener(this);
		fb.setOnClickListener(this);
		tw.setOnClickListener(this);
		feed.setOnClickListener(this);
		rec.setOnClickListener(this);
		rate.setOnClickListener(this);
		err.setOnClickListener(this);

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
		case R.id.us:break;
		case R.id.app:break;
		case R.id.fb:break;
		case R.id.tw:break;
		case R.id.rec:break;
		case R.id.rate:break;
		case R.id.er:break;
		case R.id.feed:break;

		}
	}

}
