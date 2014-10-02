package com.newmoneyfun.asyncteam.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;

import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.fragment.SplashFragment;

public class WelcomeActivity extends FragmentActivity {
	
	LinearLayout lyout_top;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		lyout_top=(LinearLayout) findViewById(R.id.llyout_welcome_top);
		lyout_top.setVisibility(View.GONE);
		FragmentManager mFragManager=getSupportFragmentManager();
		FragmentTransaction mTransaction=mFragManager.beginTransaction();
		mTransaction.replace(R.id.flyout_welcome_container, new SplashFragment(),"splash");
		mTransaction.commit();
		
//		new Handler().postDelayed(, SPLASH_DISPLAY_LENGTH);
	}
	
//	private class DisplaySplash
	
	public void showTitle(){
		lyout_top.setVisibility(View.VISIBLE);
	}


	
	
	
	

}
