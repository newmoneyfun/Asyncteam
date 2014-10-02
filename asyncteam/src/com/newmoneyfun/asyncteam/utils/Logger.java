package com.newmoneyfun.asyncteam.utils;

import android.util.Log;


/**
 * 日志记录类
 * @author Administrator
 *
 */
public class Logger {
	
	/***是否显示log*/
	private static final boolean DEBUG_LOG=true;
	/***显示的log等级*/
	private static final int DEBUG_LEVEL=7;
	
	private static final int LOG_VERBOSE=1;
	private static final int LOG_DEBUG=2;
	private static final int LOG_INFO=3;
	private static final int LOG_WARN=4;
	private static final int LOG_ERROR=5;
	private static final int LOG_ASSERT=6;
	

	public static void v(String TAG,String msg){
		if(DEBUG_LOG){
			if(DEBUG_LEVEL>LOG_VERBOSE){
				Log.v(TAG, msg);
			}
		}
	}
	public static void d(String TAG,String msg){
		if(DEBUG_LOG){
			if(DEBUG_LEVEL>LOG_DEBUG){
				Log.v(TAG, msg);
			}
		}
	}
	public static void i(String TAG,String msg){
		if(DEBUG_LOG){
			if(DEBUG_LEVEL>LOG_INFO){
				Log.v(TAG, msg);
			}
		}
	}
	public static void w(String TAG,String msg){
		if(DEBUG_LOG){
			if(DEBUG_LEVEL>LOG_WARN){
				Log.v(TAG, msg);
			}
		}
	}
	public static void e(String TAG,String msg){
		if(DEBUG_LOG){
			if(DEBUG_LEVEL>LOG_ERROR){
				Log.v(TAG, msg);
			}
		}
	}
	public static void a(String TAG,String msg){
		if(DEBUG_LOG){
			if(DEBUG_LEVEL>LOG_ASSERT){
				Log.v(TAG, msg);
			}
		}
	}

}
