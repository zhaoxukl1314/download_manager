package com.example.zhaoxu.downloadmanager.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhaoxu.downloadmanager.R;

/**
 * Description:
 * 
 * @author LN liuning800203@aliyun.com
 * @since 2014-1-8
 * @version 1.0
 */
public class MainActivity extends Activity {
	Intent intent = null;

	private Button b1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		initControl();
		
		initButton();
	}

	private void initControl() {
		b1 = (Button) findViewById(R.id.button1);
	}

	private void initButton() {
		b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				intent = new Intent(MainActivity.this,
						DownloadManagerDemo.class);
				startActivity(intent);
			}
		});

	}
}
