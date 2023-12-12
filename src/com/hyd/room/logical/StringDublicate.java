package com.hyd.room.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasarao";
	char[] ch=	str.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(Character i:ch){
		if(map.containsKey(i)){
			map.put(i, map.get(i) +1);
		}
		else{
			map.put(i, 1);
		}
	}
	Set<Character> keyset=map.keySet();
	for(Character char1:keyset){
	if(map.get(char1)>1){
		System.out.println("key is::"+char1+"value is" + map.get(char1)) ;

		}
	}

	}

}
