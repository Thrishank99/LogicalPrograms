package com.hyd.room.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDublicates {
	static List list2 = new ArrayList();

	public List m1() {
		List list = new ArrayList();
		list.add("srinu");
		list.add("naresh");
		list.add("mahi");
		list.add("natresh");
		list.add("mahi");
		//list.add(100);
		//list.add(100);
		Collections.sort(list);
		System.out.println("sorting based on"+list);
		for (Object object : list) {

			if (!list2.contains(object)) {
				list2.add(object);
			}

		}
		return list2;

	}

	public static void main(String[] args) {
		RemoveDublicates r = new RemoveDublicates();
		r.m1();
		System.out.println(list2);
	}

}
