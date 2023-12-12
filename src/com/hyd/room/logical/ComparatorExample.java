package com.hyd.room.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList();
		list.add(new Employee(810688, "zreenuvasak", "hyderabad", "associative"));
		list.add(new Employee(810687, "suresh", "chennai", "srassociative"));
		list.add(new Employee(810688, "creenu", "hyd", "pa"));
		list.add(new Employee(810688, "greenuvasak", "hyderabad", "associative"));
		list.add(new Employee(810680, "sreenuvasak", "hyderabad", "associative"));
		list.add(new Employee(810689, "mahe", "kmm", "dl"));
		System.out.println(list);
		Collections.sort(list, new Comparator<Employee>() {

			/*@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getEmpName().compareTo(o1.getEmpName());
			}
		});*/

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getEmpId()>o2.getEmpId()?-1:o2.getEmpId()>o1.getEmpId()? 1:0;
			}
		});
			
		
	System.out.println(list);	
		
		
		
		//Set<Employee>set = new HashSet<Employee>(list);
		//System.out.println(set);
	}

}
