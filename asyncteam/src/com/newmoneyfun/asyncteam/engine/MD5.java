package com.newmoneyfun.asyncteam.engine;

import java.security.MessageDigest;

import com.newmoneyfun.asyncteam.utils.Logger;

/**
 * md5加密类
 * @author newmoneyfun
 *
 */
public class MD5 {
	private static final String TAG="MD5";
	
	/**
	 * 将字符串进行md5加密
	 * @param string 需要加密的字符串
	 * @return 如果加密失败，返回null
	 */
	public static String getMD5(String string) {
	    byte[] hash;
	    try {
	        hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
	        StringBuilder hex = new StringBuilder(hash.length * 2);
		    for (byte b : hash) {
		        if ((b & 0xFF) < 0x10) hex.append("0");
		        hex.append(Integer.toHexString(b & 0xFF));
		    }
		    return hex.toString();
		    
	    } catch (Exception err) {
	    	Logger.e(TAG, "md5加密发生错误");
	    }
	   return null;
	}

}
