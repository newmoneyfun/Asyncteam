package com.newmoneyfun.asyncteam.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.newmoneyfun.asyncteam.R;

public class LoginFragment extends Fragment{
	
	private EditText et_account;
	private EditText et_password;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_login, container, false); 
		et_account=(EditText) view.findViewById(R.id.et_login_account);
		et_password=(EditText) view.findViewById(R.id.et_login_password);
		et_account.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
//		if(et_account.isFocused()){
//			et_account.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.text_bg_active));
//		}else{
//			et_account.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.text_bg_default));
//		}
		
		showTopLayout();
		return view;
	}
	
	private void showTopLayout(){
		LinearLayout lyout_top=(LinearLayout) getActivity().findViewById(R.id.llyout_welcome_top);
		lyout_top.setVisibility(View.VISIBLE);
		
		ImageView iv_logo=(ImageView) lyout_top.findViewById(R.id.imgv_title_logo);
		iv_logo.setBackgroundDrawable(getActivity().getResources().getDrawable(R.drawable.ic_launcher));
		
		ImageView iv_menu_left=(ImageView) lyout_top.findViewById(R.id.imgv_title_menu_left);
		ImageView iv_menu_middle=(ImageView) lyout_top.findViewById(R.id.imgv_title_menu_middle);
		ImageView iv_menu_right=(ImageView) lyout_top.findViewById(R.id.imgv_title_menu_right);
		
		iv_menu_left.setVisibility(View.GONE);
		iv_menu_middle.setVisibility(View.GONE);
		iv_menu_right.setVisibility(View.GONE);
		
		TextView tv_name=(TextView) lyout_top.findViewById(R.id.tv_title_name);
		tv_name.setText("Login");
	}
	
	
	

}
