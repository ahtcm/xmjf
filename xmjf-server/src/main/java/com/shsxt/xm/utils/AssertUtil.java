package com.shsxt.xm.utils;


import com.shsxt.xm.exceptions.ParamsExcetion;

public class AssertUtil {
	
	public static void isTrue(Boolean flag,String errorMsg) {
		if(flag){
			throw new ParamsExcetion(errorMsg);
		}
	}
	
	
	public static void isTrue(Boolean flag,String errorMsg,Integer errorCode) {
		if(flag){
			throw new ParamsExcetion(errorMsg,errorCode);
		}
	}
	

	
}
