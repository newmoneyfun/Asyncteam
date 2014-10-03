package com.newmoneyfun.asyncteam.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.newmoneyfun.asyncteam.MainActivity;
import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.interfaceabstract.ITopMenus;

public class LoginFragment extends Fragment implements ITopMenus {
	

	private EditText et_account;
	private EditText et_password;
	private Button btn_login;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_login, container, false); 
		et_account=(EditText) view.findViewById(R.id.et_login_account);
		et_password=(EditText) view.findViewById(R.id.et_login_password);
		
		btn_login=(Button) view.findViewById(R.id.btn_login_submit);
		btn_login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(et_account.getText().toString().equals("fan")&&et_password.getText().toString().equals("fan")){
					Intent intent=new Intent(getActivity().getApplicationContext(),MainActivity.class);
					startActivity(intent);
					getActivity().finish();
				}
			}
		});
		return view;
	}

	@Override
	public void showOrHideMenuLayout(LinearLayout v_layout) {
		v_layout.setVisibility(View.VISIBLE);
		
	}

	@Override
	public void dalTopBack(ImageView v_back) {
		v_back.setVisibility(View.GONE);
	}

	@Override
	public void dalTopLogo(ImageView v_logo) {
		v_logo.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.ic_launcher));
		
	}

	@Override
	public void dalTopTitle(TextView tv_title) {
		tv_title.setText("Login");
		
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
				FragmentTransaction mTransaction=getFragmentManager().beginTransaction();
				mTransaction.replace(R.id.flyout_welcome_container ,new RegisteFragment(),"registe");
				mTransaction.commit();
				
			}
		});
		
	}

	
	
	

}
