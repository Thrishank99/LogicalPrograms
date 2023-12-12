package com.hyd.room.logical;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add(1);
		set.add("srinu");
		set.add("srinu");
		set.add('A');
		set.add(10.0);
		set.add(1);
		System.out.println(set);
		Set set2=new LinkedHashSet();
		set2.add(1);
		set2.add("srinu");
		set2.add("srinu");
		set2.add('A');
		set2.add(10.0);
		set2.add(1);
		System.out.println(set2);
		Set set3=new TreeSet();
		set3.add("sbc");
		set3.add("srinu");
		set3.add("srinu");
		set3.add("naresh");
		set3.add("chi");
		set3.add("abc");
		System.out.println(set3);
		Set set4=new TreeSet();
		set4.add(33);
		set4.add(0);
		set4.add(31);
		set4.add(999);
		set4.add(33);
		set4.add(8);
		System.out.println(set4);
		
	}

}
