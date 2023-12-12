package com.hyd.room.logical;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
	Map map=new HashMap();
	map.put(1, 1);
	map.put(1, "test");
	map.put("sri", 1);
	map.put(5, "test");
	map.put("srinu", "naresh");
	System.out.println(map);
	Map map2=new LinkedHashMap();
	map2.put(1, 1);
	map2.put(1, "test");
	map2.put("sri", 1);
	map2.put(5, "test");
	map2.put("srinu", "naresh");
	System.out.println(map2);
	Map map4=new TreeMap();
	map4.put(1, 1);
	map4.put(1, "test");
	map4.put(8, 1);
	map4.put(5, "test");
	map4.put(3, "naresh");
	System.out.println(map4);
	
	Map map5=new Hashtable();
	map5.put("ammu", 1);
	map5.put(1, "test");
	map5.put(8, 1);
	map5.put(5, "test");
	map5.put(3, "naresh");
	map5.put("sri", 100);
	System.out.println(map5);
	Map<Bakery,Integer> obj=new HashMap<>();
	obj.put(new Bakery(2010,"sriwacha","bun",20), 25);
	obj.put(new Bakery(2010,"sriwacha","bun",20), 25);
	obj.put(new Bakery(2010,"sriwacha","dilkush",18), 18);
	obj.put(new Bakery(2010,"sriwacha","bicate",20), 1);
	obj.put(new Bakery(2010,"sriwacha","sweet",200), 10);
	System.out.println(obj);
	
	}

}
