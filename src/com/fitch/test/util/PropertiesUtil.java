package com.fitch.test.util;

public class PropertiesUtil {

	private static final PropertiesUtil INSTANCE = new PropertiesUtil();

	private PropertiesUtil(){
	} 
	
	public static PropertiesUtil getInstance(){
		return INSTANCE;
	}
	
	public String getDBConnection(){
		return "Yeahhhh.....";
	}
}
