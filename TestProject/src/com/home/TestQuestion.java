package com.home;

import java.util.HashMap;


public class TestQuestion {

	
	
	
	
	public static void main(String[] args) {
	 	String Str = "abaccsddffrass";
		
	 	
	 	int len = Str.length();
	 	HashMap<Character,Integer> uniqueCount = new HashMap<Character,Integer>();
	 	Integer count=0;
	 	
	 	for(int i=0;i<len;i++) {
	 		
	 		if(uniqueCount.containsKey(Str.charAt(i))) {
	 			 count = uniqueCount.get(Str.charAt(i))+1;
	 			uniqueCount.put(Str.charAt(i), count);
	 		}else
	 		uniqueCount.put(Str.charAt(i),1);;	 		
	 	}
		
	 	System.out.println(uniqueCount);
	 
		
	}
}
