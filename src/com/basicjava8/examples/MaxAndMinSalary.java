package com.basicjava8.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sorting.examples.Employee;

public class MaxAndMinSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "suresh", 15000, "PA"));
		list.add(new Employee(101, "rajee", 85000, "PADESC"));
		list.add(new Employee(101, "ajay", -95000, "SENIORSW"));
		list.add(new Employee(107, "yyr", 70000, "MANAGER"));
		list.add(new Employee(105, "srinu", 30000, "TL"));
		
		Employee maxSalary=list.stream().max((s1,s2)->s1.getSalary()<s2.getSalary() ?-1:s1.getSalary()>s2.getSalary()? 1:0).get();
		System.out.println(maxSalary);
		Employee minSalary=list.stream().min((s1,s2)->s1.getSalary()<s2.getSalary() ?-1:s1.getSalary()>s2.getSalary()? 1:0).get();
		System.out.println(minSalary);
		Double maxSalary1=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getMax();
		System.out.println(maxSalary1);
		Double minSalary1=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getMin();
		System.out.println(minSalary1);
		Double SumSalary=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getSum();
		System.out.println(SumSalary);
		long counts=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getCount();
		System.out.println(counts);
		Double avg=list.stream().mapToDouble(x->x.getSalary()).summaryStatistics().getAverage();
		System.out.println(avg);
		

	}

}
