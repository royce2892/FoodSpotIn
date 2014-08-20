package com.foodadi;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener{
	Button ex,sp,fav,mor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ex=(Button) findViewById(R.id.explore);
		sp=(Button) findViewById(R.id.spot);
		fav=(Button) findViewById(R.id.fav);
		mor=(Button) findViewById(R.id.more);
		ex.setOnClickListener(this);
		sp.setOnClickListener(this);
		fav.setOnClickListener(this);
		mor.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.explore:Intent myint = new Intent(this,Ex.class);
		startActivity(myint);break;
		case R.id.spot:myint = new Intent(this,Sp.class);
		startActivity(myint);break;
		case R.id.fav:myint = new Intent(this,Fa.class);
		startActivity(myint);break;
		case R.id.more:myint = new Intent(this,Mo.class);
		startActivity(myint);break;
		}
	}

}
