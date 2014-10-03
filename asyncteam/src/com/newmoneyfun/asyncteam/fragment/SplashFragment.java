package com.newmoneyfun.asyncteam.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.interfaceabstract.ITopMenus;

/**
 * the first view of the app
 * </br>in this fragment,system will show the welcome view to user
 * </br>and minewhile sys will do something like 
 * </br>check version of the app
 * </br>it's will navigate to main ui or login ui if unlogined
 * @author newmoneyfun
 *
 */
public class SplashFragment extends Fragment implements ITopMenus{
	
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

	@Override
	public void showOrHideMenuLayout(LinearLayout v_layout) {
		v_layout.setVisibility(View.GONE);
		
	}

	@Override
	public void dalTopBack(ImageView v_back) {
		
	}

	@Override
	public void dalTopLogo(ImageView v_logo) {
		
	}

	@Override
	public void dalTopTitle(TextView tv_title) {
		
	}

	@Override
	public void dalMenuLeft(ImageView v_menu_left) {
		
	}

	@Override
	public void dalMenuMiddle(ImageView v_menu_middle) {
		
	}

	@Override
	public void dalMenuRight(ImageView v_menu_right) {
		
	}

	

	
	
	
	

}
