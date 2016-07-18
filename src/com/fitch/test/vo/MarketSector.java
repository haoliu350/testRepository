package com.fitch.test.vo;

import java.util.Comparator;

public class MarketSector implements Comparable<MarketSector>{
	
	private String id;
	private String name;
	
	public MarketSector(){
		
	}
	
	public MarketSector(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(MarketSector other) {
		String otherName = ((MarketSector) other).getName(); 
		return this.name.compareTo(otherName);
	}
	
	public static Comparator<MarketSector> MarketSectorNameComparator = new Comparator<MarketSector>() {

	    public int compare(MarketSector marketSector1, MarketSector marketSector2) {
	    	
/*	      String marketSectorName1 = marketSector1.getName();//.toUpperCase();
	      String marketSectorName2 = marketSector1.getName();//.toUpperCase();
	      return marketSectorName1.compareTo(marketSectorName2);*/
	    	return marketSector1.getName().toUpperCase().compareTo(marketSector2.getName().toUpperCase());

	    }

	};
}
