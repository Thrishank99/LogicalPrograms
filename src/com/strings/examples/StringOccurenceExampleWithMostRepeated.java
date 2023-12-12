package com.strings.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringOccurenceExampleWithMostRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Set<Entry<Character, Integer>> set=map.entrySet();
		int maxCount=0;
		char maxChar=0;
		 
        for (Entry<Character, Integer> entry : set) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
            
        }
        System.out.println(maxChar+" : "+maxCount);
	}

}
