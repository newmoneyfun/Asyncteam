package com.newmoneyfun.asyncteam.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.fragment.SplashFragment;
import com.newmoneyfun.asyncteam.interfaceabstract.ITopMenus;

public class WelcomeActivity extends FragmentActivity{
	
	LinearLayout lyout_top;
	private long exitTime=0;

	private ImageView iv_top_back;
	private ImageView iv_top_logo;
	private TextView tv_top_name;
	private ImageView iv_top_menu_left;
	private ImageView iv_top_menu_middle;
	private ImageView iv_top_menu_right;
	private ITopMenus mCallback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		addSplashFragment();
		lyout_top=(LinearLayout) findViewById(R.id.llyout_welcome_top);
		
		initMenuView();
		
	}
	


	private void initMenuView(){
		iv_top_back=(ImageView) lyout_top.findViewById(R.id.imgv_title_back);
		iv_top_logo=(ImageView) lyout_top.findViewById(R.id.imgv_title_logo);
		tv_top_name=(TextView) lyout_top.findViewById(R.id.tv_title_name);
		
		iv_top_menu_left=(ImageView) lyout_top.findViewById(R.id.imgv_title_menu_left);
		iv_top_menu_left.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});
		
		iv_top_menu_middle=(ImageView) lyout_top.findViewById(R.id.imgv_title_menu_middle);
		iv_top_menu_middle.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});
		
		iv_top_menu_right=(ImageView) lyout_top.findViewById(R.id.imgv_title_menu_right);
		iv_top_menu_right.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			}
		});
		
		
		
		
	}
	

	@Override
	public void onAttachFragment(Fragment fragment) {
		super.onAttachFragment(fragment);
		try{
			mCallback=(ITopMenus) fragment;
			mCallback.showOrHideMenuLayout(lyout_top);
			mCallback.dalTopBack(iv_top_back);
			mCallback.dalTopLogo(iv_top_logo);
			mCallback.dalTopTitle(tv_top_name);
			mCallback.dalMenuLeft(iv_top_menu_left);
			mCallback.dalMenuMiddle(iv_top_menu_middle);
			mCallback.dalMenuRight(iv_top_menu_right);
		}catch(Exception err){
			err.printStackTrace();
		}
		
	}



	private void addSplashFragment(){
		FragmentManager mFragManager=getSupportFragmentManager();
		FragmentTransaction mTransaction=mFragManager.beginTransaction();
		mTransaction.replace(R.id.flyout_welcome_container, new SplashFragment(),"splash");
		mTransaction.commit();
	}

//	@Override
//	public void login() {
//		FragmentTransaction mTransaction=getSupportFragmentManager().beginTransaction();
//		mTransaction.replace(R.id.flyout_welcome_container ,new RegisteFragment());
//		mTransaction.addToBackStack(null);
//		mTransaction.commit();
//	}

//	public interface TopMenuListener{
//		public void showMenu(View v);
//		public void setDrawable(ImageView v);
//		public void setTitle(TextView v);
//		public void leftClick();
//		public void middleClick();
//		public void rightClick();
//	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		if(keyCode==KeyEvent.KEYCODE_BACK&&event.getAction()==KeyEvent.ACTION_DOWN){
			if(SystemClock.uptimeMillis()-exitTime>2000){
				Toast.makeText(this, "back again to exit", Toast.LENGTH_SHORT).show();
				exitTime=SystemClock.uptimeMillis();
			}else{
				finish();
				System.exit(0);
			}
			return true;
			
		}
		return super.onKeyDown(keyCode, event);
	}

	

	
	
	
	

}
