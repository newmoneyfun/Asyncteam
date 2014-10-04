package com.newmoneyfun.asyncteam.utils;

/**
 * the help class
 * @author newmoneyfun
 *
 */
public class Utils {
	
	/**
	 * check wheather the sd card is exists
	 * @return
	 */
	public static boolean checkSDCardExists(){
		if(android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED)){
			return true;
		}
		return false;
	}
	
	

}
