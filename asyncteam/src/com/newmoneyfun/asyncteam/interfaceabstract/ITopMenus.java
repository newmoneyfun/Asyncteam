package com.newmoneyfun.asyncteam.interfaceabstract;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public interface ITopMenus {
	
	/**
	 * show or hide the top menu layout
	 * </br>if current view is hide,
	 * </br>all of other method in this interface will out of use
	 * @param v_layout
	 */
	public void showOrHideMenuLayout(LinearLayout v_layout);
	/**
	 * show or hide the back imageview if current page is request to back
	 * @param v_back
	 */
	public void dalTopBack(ImageView v_back);
	/**
	 * set current page's logo
	 * @param v_logo
	 */
	public void dalTopLogo(ImageView v_logo);
	/**
	 * set current page's name
	 * @param tv_title
	 */
	public void dalTopTitle(TextView tv_title);
	/**
	 * show and add function at menu right-left
	 * @param v_menu_left
	 */
	public void dalMenuLeft(ImageView v_menu_left);
	/**
	 * show and add function at menu right-middle
	 * @param v_menu_middle
	 */
	public void dalMenuMiddle(ImageView v_menu_middle);
	/**
	 * show and add function at menu right-right
	 * @param v_menu_right
	 */
	public void dalMenuRight(ImageView v_menu_right);

}
