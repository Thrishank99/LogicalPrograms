package com.hyd.room.logical;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add("srinu");
		list.add('A');
		list.add(null);
		list.add(null);
		list.add(true);
		System.out.println(list);
		List<Bakery> l=new ArrayList<>();
		l.add(new Bakery(101,"sriwacha","pup",99));
		System.out.println(l);
		
		
		List list2=new LinkedList();
		list2.add(1);
		list2.add("srinu");
		list2.add('A');
		list2.add(null);
		list2.add(null);
		list2.add(null);
		list2.add(true);
		System.out.println(list2);
		
		List list3=new Vector();
		list3.add(1);
		list3.add("srinu");
		list3.add('A');
		list3.add(null);
		list3.add(null);
		list3.add(null);
		list3.add(true);
		System.out.println(list);
		Vector v=new Stack();
		v.add(list3);
		System.out.println(v);
		
		{
			
		}

	}

}
