package com.filter.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sorting.examples.Employee;

public class PrintEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "suresh", 15000, "PA"));
		list.add(new Employee(101, "rajee", 85000, "PADESC"));
		list.add(new Employee(104, "ajay", -95000, "SENIORSW"));
		list.add(new Employee(107, "yyr", 70000, "MANAGER"));
		list.add(new Employee(105, "srinu", 30000, "TL"));
		System.out.println(list);

		List<Employee> evennumber = list.stream().filter(i -> i.getEmpId() % 2 == 0).collect(Collectors.toList());
		System.out.println("EVEN NUMBERS" + evennumber);
		// ==================================================================================================

		List<Employee> oddnumber = list.stream().filter(i -> i.getEmpId() % 2 != 0).collect(Collectors.toList());
		System.out.println("ODD NUMBERS" + oddnumber);
		// ===================================================================================================
		List<String> AllDesignations = list.stream().map(i -> i.getDesignation()).collect(Collectors.toList());
		System.out.println(AllDesignations);
		// =====================================================================================================
		List<Employee> salaries = list.stream().filter(i -> i.getSalary() > 15000).collect(Collectors.toList());
		System.out.println(salaries);
		List<Employee> matched = list.stream().filter(i -> i.getEmpName().equals("srinu")).collect(Collectors.toList());
		System.out.println(matched);

	}

}
