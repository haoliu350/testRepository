package com.fitch.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fitch.test.util.DateFormatConvertor;

public class Testapp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	    /*String input = "aaaaabbccccdeeef";
	    String output = filter(input);
	    System.out.println(output);*/
	    
	    //System.out.println(PropertiesUtil.getInstance().getDBConnection());
		
		
/*		TestCollection tc = new TestCollection();
		List<String> marketSectors = new ArrayList<>();
		marketSectors.add("AAA");
		marketSectors.add("AAA");
		marketSectors.add("BBB");
		marketSectors.add("BBB");
		marketSectors.add("BBB");
		marketSectors.add("BBB");
		marketSectors.add("BBB");
		marketSectors.add("AAA");
		marketSectors.add("AAA");
		marketSectors.add("AAA");
		marketSectors.add("AAA");
		marketSectors.add("CCC");
		marketSectors.add("CCC");
		marketSectors.add("DDD");
		marketSectors.add("DDD");
		marketSectors.add("DDD");
		marketSectors.add("DDD");
		marketSectors.add("DDD");
		marketSectors.add("CCC");
		marketSectors.add("CCC");
		marketSectors.add("CCC");
		System.out.println(tc.removeDuplicate2(marketSectors));
		*/
/*		
		List<MarketSector> marketSector = new ArrayList<MarketSector>();
		marketSector.add(new MarketSector("3", "Bee"));
		marketSector.add(new MarketSector("13", "Winner"));
		marketSector.add(new MarketSector("4", "Bear"));
		marketSector.add(new MarketSector("5", "Cat"));
		marketSector.add(new MarketSector("12", "Dustin"));
		marketSector.add(new MarketSector("6", "Coco"));
		marketSector.add(new MarketSector("15", "Okla"));
		marketSector.add(new MarketSector("8", "Michael"));
		marketSector.add(new MarketSector("7", "Nuke"));
		marketSector.add(new MarketSector("1", "Austin"));
		marketSector.add(new MarketSector("2", "Apple"));
		marketSector.add(new MarketSector("9", "Oma"));
		marketSector.add(new MarketSector("10", "Peter"));
		marketSector.add(new MarketSector("11", "King"));
		marketSector.add(new MarketSector("14", "Zippo"));
		
		MarketSectors ms = new MarketSectors();
		ms.setMarketSectors(marketSector);
		
		
		//sort here
		
		//marketSector.sort(new Comparator );
		Collections.sort(marketSector, MarketSector.MarketSectorNameComparator);
		//Collections.sort(marketSector);
		for(MarketSector m : marketSector) {
			System.out.println(m.getName());
		}*/
		
		//System.out.println("Bee".compareTo("Austin"));
		
		
		/*DateFormatConvertor df = new DateFormatConvertor();
		System.out.println(df.changeDateFormat("1st September 2012"));*/
		
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


	private static String filter(String input){
		String result = "";
		char c[] = input.toCharArray();
		char previous = ' ';
		int counter = 1;
		
		for(char pointer : c){
			if(previous == pointer){
				
				if(counter < 3){
					result += pointer; 
					counter ++;
				}
				
			} else{
				result += pointer; 
				counter = 1;
			}
			previous = pointer;
		}
		
		return result;
		
	}

}
