package com.fitch.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat fmt = new SimpleDateFormat("dd MMMM yyyy");
		DateFormat fmt2 = new SimpleDateFormat("yyyy-MM-dd");
		String input = "22nd August 2012";
		//String date = input.replaceFirst("st", "").replaceFirst("nd", "").replaceFirst("rd", "").replaceFirst("th", "");
		//System.out.println(date);
		String temp = "";
		String[] sarray = input.split(" ");
		if(sarray[0].endsWith("st")){
			sarray[0] = sarray[0].replace("st", "");
		} else if(sarray[0].endsWith("nd")){
			sarray[0] = sarray[0].replace("nd", "");
		} else if(sarray[0].endsWith("rd")){
			sarray[0] = sarray[0].replace("rd", "");
		} else {
			sarray[0] = sarray[0].replace("th", "");
		}
		for(String s : sarray){
			temp += s + " ";
		}
		System.out.println(temp);
		try {
//			System.out.println(fmt2.format((fmt.parse(date))));
			System.out.println(fmt2.format((fmt.parse(temp))));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
