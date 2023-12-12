package com.hyd.room.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer [] itr={22,5,5,7,45,54,7,4,44,41,544,441,49,
		444,44,4,44,88,845,445,4454,88,4,5,57,6,22};

Map<Integer,Integer> map=new HashMap<Integer,Integer>();
for(Integer it:itr){
	if(map.containsKey(it)){
		map.put(it, map.get(it) +1);
	}
	else{
		map.put(it, 1);
	}
}
Set<Integer> keyset=map.keySet();
for(Integer key:keyset){
	if(map.get(key)>1){
		System.out.println("key is:::"+key+"value is:::"+map.get(key));
	
	
}
}




	}

}
