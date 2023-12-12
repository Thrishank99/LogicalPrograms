package com.hyd.room.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveListDublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(1);
		l.add(8);
		l.add(7);
		l.add(2);
		l.add(1);
		Collections.sort(l);
		System.out.println(l);
		List set2=new LinkedList(l);
		System.out.println(set2);
		Set set=new HashSet();
		set.add("hgf");
		set.add("srinu");
		set.add("srinu1");
		set.add("nare");
		set.add("abc");
		Collections.sort(set2);

		System.out.println(set);

	}

}
