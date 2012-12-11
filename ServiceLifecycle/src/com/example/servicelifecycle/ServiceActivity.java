package com.example.servicelifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ServiceActivity extends Activity {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	setContentView(R.layout.activity_service);
		 TextView view = new TextView(this);      
     view.setText("Service Test");
     Intent i = new Intent();
     i.setClassName( "com.example.servicelifecycle",
      "com.example.servicelifecycle.MyService" );
     //bindService( i, null, Context.BIND_AUTO_CREATE);
     this.startService(i);      
     setContentView(view);
		
	}

	@Override
	public boolean onCreateOptionsMenu (Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_service, menu);
		return true;
	}

}
