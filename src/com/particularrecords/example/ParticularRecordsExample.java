package com.particularrecords.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sorting.examples.Employee;

public class ParticularRecordsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "suresh", 15000, "PA"));
		list.add(new Employee(101, "rajee", 85000, "PADESC"));
		list.add(new Employee(101, "ajay", -95000, "SENIORSW"));
		list.add(new Employee(107, "yyr", 70000, "MANAGER"));
		list.add(new Employee(105, "srinu", 30000, "TL"));
		System.out.println(list);
		List<Employee> paticularrecord = list.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(paticularrecord);
		//==============================================================================================================
		List<Employee> sort1 = list.stream()
				.sorted((s1, s2) -> s1.getEmpId() < s2.getEmpId() ? -1 : s1.getEmpId() > s2.getEmpId() ? 1 : 0).skip(1).limit(2)
				.collect(Collectors.toList());
		System.out.println(sort1);
//========================================================================================================================
	
                
	}

}
