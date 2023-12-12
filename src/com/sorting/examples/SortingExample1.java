package com.sorting.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample1 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "suresh", 15000, "PA"));
		list.add(new Employee(101, "rajee", 85000, "PADESC"));
		list.add(new Employee(101, "ajay", -95000, "SENIORSW"));
		list.add(new Employee(107, "yyr", 70000, "MANAGER"));
		list.add(new Employee(105, "srinu", 30000, "TL"));
		// System.out.println(list);

		List<Employee> addList = new ArrayList<Employee>();
		List<Employee> addList2 = new ArrayList<Employee>();
		List<Employee> addList3 = new ArrayList<Employee>();

		List<Employee> sort1 = list.stream()
				.sorted((s1, s2) -> s1.getEmpId() < s2.getEmpId() ? -1 : s1.getEmpId() > s2.getEmpId() ? 1 : 0).skip(1).limit(1)
				.collect(Collectors.toList());
		for (Employee emp1 : sort1) {

			addList.add(emp1);
		}
		System.out.println(addList);
		// =======================================================================================================================================================
		List<Employee> sort2 = list.stream()
				.sorted((s1, s2) -> s1.getSalary() > s2.getSalary() ? -1 : s1.getSalary() < s2.getSalary() ? 1 : 0)
				.collect(Collectors.toList());
		for (Employee emp2 : sort2) {

			addList2.add(emp2);
		}
		System.out.println(addList2);
		// =============================================================================================================================================================
		List<Employee> sort3 = list.stream().sorted((s1, s2) -> s1.getEmpName().compareTo(s2.getEmpName()))
				.collect(Collectors.toList());
		for (Employee emp3 : sort3) {
			addList3.add(emp3);
		}
		System.out.println(addList3);
		// ============================================================================================================================================
		List<Double> allSalaries = list.stream().map(i -> i.getSalary()).collect(Collectors.toList());
		List<String> allEmpNames = list.stream().map(i -> i.getEmpName()).collect(Collectors.toList());
		// System.out.println(allSalaries);
		List<String> sortedEmpNames = allEmpNames.stream().sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		List<Double> sortedSalaries2 = allSalaries.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		List<Double> sortedSalaries3 = allSalaries.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedEmpNames);
		// ===========================================================================================================================================
	}

}
