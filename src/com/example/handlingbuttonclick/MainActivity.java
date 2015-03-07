package com.example.handlingbuttonclick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{

	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b=(Button)findViewById(R.id.button1);
		
		//ButtonHandler bv=;
		
		b.setOnClickListener(new ButtonHandler());

	}
	
	class ButtonHandler implements OnClickListener
	{

		@Override
		public void onClick(View v)
		{
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this,"U have Clicked a Button", Toast.LENGTH_LONG).show();
			
		}
		
	}
	

//	public void clickEvent(View v) 
//	{
//		Toast.makeText(MainActivity.this,"U have Clicked a Button", Toast.LENGTH_LONG).show();
//		
//		
//	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.this,"U have Clicked a Button", Toast.LENGTH_LONG).show();
	}



}
