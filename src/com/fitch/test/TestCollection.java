package com.fitch.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollection {

	public List<Integer> removeDuplicate(List<Integer> input){
		//HashSet<Integer> tempSet = (HashSet) Stream.of(input).collect(Collectors.toSet());
		//return tempSet.stream().collect(Collectors.toList());
		
		return (List<Integer>) ((HashSet)Stream.of(input).collect(Collectors.toSet())).stream().collect(Collectors.toList());
	}
	
	public List<String> removeDuplicate2(List<String> input){
		//Set<String> tempSet = Stream.of(input).collect(Collectors.toSet());
		//return tempSet.stream().collect(Collectors.toList());
		
		//return (List<String>)((HashSet)Stream.of(input).collect(Collectors.toSet())).stream().collect(Collectors.toList());
		//Set<String> tempSet = new HashSet<String>(input);
		return new ArrayList<String>(new HashSet<String>(input));
		
	}
}
