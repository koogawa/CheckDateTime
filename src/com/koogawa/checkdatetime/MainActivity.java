package com.koogawa.checkdatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView myDateTimeView;
	private Button myShowDate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myDateTimeView = (TextView) findViewById(R.id.currentTimeView);
		myShowDate = (Button) findViewById(R.id.button);
		
		myShowDate.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showCurrentDate();
			}
		});
		showCurrentDate();
	}

	private void showCurrentDate() {
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy.MM.dd '/' hh:mm:ss a zzz");
		Date currentTime = new Date();
		myDateTimeView.setText(sdf.format(currentTime));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
