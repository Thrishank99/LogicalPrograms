package com.dublicates.examples;

import java.util.HashMap;
import java.util.Map;

public class StringOcurenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sreenivasarao";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character char1:ch){
			if(map.containsKey(char1)){
				map.put(char1, map.get(char1) +1);
				
			}
			else{
				map.put(char1, +1);
			}	
		}
		System.out.println(map);
	}

}
