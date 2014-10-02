package com.newmoneyfun.asyncteam.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newmoneyfun.asyncteam.R;

/**
 * the first view of the app
 * </br>in this fragment,system will show the welcome view to user
 * </br>and minewhile sys will do something like 
 * </br>check version of the app
 * </br>it's will navigate to main ui or login ui if unlogined
 * @author newmoneyfun
 *
 */
public class SplashFragment extends Fragment{
	
	private final int SPLASH_DISPLAY_LENGTH=2500;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		 View view = inflater.inflate(R.layout.fragment_splash, container, false); 
		 new Handler().postDelayed(new DisplaySplash(), SPLASH_DISPLAY_LENGTH);
		 return view;
	}
	
	private class DisplaySplash implements Runnable{

		@Override
		public void run() {
			 FragmentTransaction mTransaction=getFragmentManager().beginTransaction();
			 mTransaction.replace(R.id.flyout_welcome_container,new LoginFragment());
			 mTransaction.commit();
			
		}
		
	}
	
	
	
	

}
