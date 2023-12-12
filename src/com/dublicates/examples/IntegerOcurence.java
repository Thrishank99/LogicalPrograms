package com.dublicates.examples;

import java.util.HashMap;
import java.util.Map;

public class IntegerOcurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] it = { 5, 4, 2, 5, 8, 8, 54, 5, 6, 4, 55, 4, 2, 5, 51 };
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer itr:it){
			if(map.containsKey(itr)){
				map.put(itr, map.get(itr) +1);
			}
			else{
				map.put(itr, +1);
			}
		}
		//System.out.println(length);
		System.out.println(map);
	}

}
