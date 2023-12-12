package com.dublicates.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.sorting.examples.Employee;

public class PrintAndRemoveDublicatesList {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "suresh", 15000, "PA"));
		list.add(new Employee(101, "rajee", 85000, "PADESC"));
		list.add(new Employee(101, "ajay", -95000, "SENIORSW"));
		list.add(new Employee(107, "yyr", 70000, "MANAGER"));
		list.add(new Employee(105, "srinu", 30000, "TL"));
		list.add(new Employee(107, "srinu", 30000, "TL"));
		// System.out.println(list);

		Set<Integer> set1 = new HashSet<Integer>();
		Set<String> set2 = new HashSet<String>();
		Set<Double> set3 = new HashSet<Double>();

		Set<Employee> dublicates1 = list.stream().filter(i -> !set1.add(i.getEmpId())).collect(Collectors.toSet());
		System.out.println(set1);
		System.out.println(dublicates1);
		Set<Employee> dublicates2 = list.stream().filter(i -> !set2.add(i.getEmpName())).collect(Collectors.toSet());
		System.out.println(set2);
		System.out.println(dublicates2);
		Set<Employee> dublicates3 = list.stream().filter(i -> !set3.add(i.getSalary())).collect(Collectors.toSet());
		System.out.println(set3);
		System.out.println(dublicates3);
	}

}
