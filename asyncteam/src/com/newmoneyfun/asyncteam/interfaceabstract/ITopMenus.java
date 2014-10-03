package com.newmoneyfun.asyncteam.interfaceabstract;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public interface ITopMenus {
	
	public void showOrHideMenuLayout(LinearLayout v_layout);
	public void dalTopBack(ImageView v_back);
	public void dalTopLogo(ImageView v_logo);
	public void dalTopTitle(TextView tv_title);
	public void dalMenuLeft(ImageView v_menu_left);
	public void dalMenuMiddle(ImageView v_menu_middle);
	public void dalMenuRight(ImageView v_menu_right);

}
