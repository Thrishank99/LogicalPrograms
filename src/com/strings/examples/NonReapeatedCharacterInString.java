package com.strings.examples;

import java.util.HashMap;
import java.util.Map;

public class NonReapeatedCharacterInString {

	public static void main(String[] args) {

		String str = "sreenivasarao";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character char1 : ch) {
			if (map.containsKey(char1)) {
				map.put(char1, map.get(char1) + 1);
			} else {
				map.put(char1, 1);
			}
		}
		System.out.println(map);
		for (Character char2 : ch) {
			if(map.get(char2)==1) {
				System.out.println("first non reapeted charater in "+str+" is "+char2);
				break;// if not put the break print the all repeated character in string
			}

		}
		for(Character char3:ch) {
			if(map.get(char3)>1) {
				System.out.println("first reapeted charater in "+str+" is "+char3);
				break;//if not put the break print the all repeated characters
			}
		}

	}
}