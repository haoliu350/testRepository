package com.fitch.test.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateFormatConvertor {
	
	public String changeDateFormat(String input){
/*		
		String result = "";
		
		String[] temp = input.split(" ");
		result += temp[2] + "-";
		switch (temp[1]) {
				case "January":
					result += "01" + "-";
					break;
				case "February":
					result += "02" + "-";
					break;
				case "March":
					result += "03" + "-";
					break;
				case "April":
					result += "04" + "-";
					break;
				case "May":
					result += "05" + "-";
					break;
				case "June":
					result += "06" + "-";
					break;
				case "July":
					result += "07" + "-";
					break;
				case "Auguest":
					result += "08" + "-";
					break;
				case "September":
					result += "09" + "-";
					break;
				case "October":
					result += "10" + "-";
					break;
				case "November":
					result += "11" + "-";
					break;
				case "December":
					result += "12" + "-";
					break;
				default :
					result += "00" + '0';
					break;
		}
		
		char[] charArray = temp[0].toCharArray();
		result += charArray[0];
		
		return result;*/
		
		DateFormat fmt = new SimpleDateFormat("dd MMMM yyyy");
		
		return null;
		
	}

}
