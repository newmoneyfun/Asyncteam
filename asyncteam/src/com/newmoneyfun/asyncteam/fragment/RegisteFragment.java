package com.newmoneyfun.asyncteam.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.interfaceabstract.ITopMenus;
import com.newmoneyfun.asyncteam.utils.Logger;

public class RegisteFragment extends Fragment implements ITopMenus {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_registe, container, false); 
		
		return view;
	}

	@Override
	public void showOrHideMenuLayout(LinearLayout v_layout) {
		v_layout.setVisibility(View.VISIBLE);
		
	}

	@Override
	public void dalTopBack(ImageView v_back) {
		v_back.setVisibility(View.VISIBLE);
		
	}

	@Override
	public void dalTopLogo(final ImageView v_logo) {
		v_logo.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.ic_launcher));
		v_logo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				FragmentManager mFragManager=getFragmentManager();
				FragmentTransaction mTransaction=mFragManager.beginTransaction();
				mTransaction.replace(R.id.flyout_welcome_container ,new LoginFragment());
				mTransaction.commit();
				v_logo.setOnClickListener(null);
			}
		});
	}

	@Override
	public void dalTopTitle(TextView tv_title) {
		tv_title.setText("Registe");
	}

	@Override
	public void dalMenuLeft(ImageView v_menu_left) {
		v_menu_left.setVisibility(View.GONE);
		
	}

	@Override
	public void dalMenuMiddle(ImageView v_menu_middle) {
		v_menu_middle.setVisibility(View.GONE);
		
	}

	@Override
	public void dalMenuRight(ImageView v_menu_right) {
		v_menu_right.setVisibility(View.VISIBLE);
		v_menu_right.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
					Context context;
					context=getActivity().getApplicationContext();
					if(context!=null){
						Toast.makeText(context, "registe", Toast.LENGTH_SHORT).show();
					}else{
						Logger.i("RegisteFragment", "context is null");
					}
				}catch(Exception err){
					err.printStackTrace();
				}
			}
		});
	}
	
	
	
	

}
