package com.convertion.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.sorting.examples.Employee;

public class ConversionExamples1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "suresh", 15000, "PA"));
		list.add(new Employee(101, "rajee", 85000, "PADESC"));
		list.add(new Employee(104, "ajay", -95000, "SENIORSW"));
		list.add(new Employee(107, "yyr", 70000, "MANAGER"));
		list.add(new Employee(105, "srinu", 30000, "TL"));
		System.out.println(list);
		// ========================================================================================================
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(101, "srinu", 25000, "PA"));
		set.add(new Employee(100, "Naresh", 15000, "ASSCOATE"));
		set.add(new Employee(108, "suresh", 45000, "SENIORASSCIATE"));
		set.add(new Employee(107, "ajay", 80000, "MANAGER"));
		System.out.println(set);
		System.out.println("=======================================================");
		// =========================================================================================================
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Employee(100, "kumar", 75000, "TL"));
		map.put(2, new Employee(101, "prakash", 35000, "MANAGER"));
		map.put(3, new Employee(102, "ponni", 95000, "SR MANAGER"));
		map.put(4, new Employee(103, "sreeni", 84000, "ASSCIATE"));
		System.out.println("===========================================================");
		// ============================================================================================================
		Set<Employee> listToSetConversion=list.stream().collect(Collectors.toSet());
		System.out.println("list To Set Conversion"+listToSetConversion);
		System.out.println("===============================================================================================");
		//================================================================================================================
		List<Employee> setToListConversion=set.stream().collect(Collectors.toList());
		System.out.println("set To list Conversion"+listToSetConversion);
		System.out.println("===============================================================================================");
		//================================================================================================================
		Map<Integer, Employee> listToMapConveraion = list.stream().collect(Collectors.toMap(Employee::getEmpId, Function.identity()));
		System.out.println("List to map conversion" + listToMapConveraion);
		System.out.println("===============================================================================================");
		//================================================================================================================
		
		List<Object> mapToListConversion = map.entrySet().stream().collect(Collectors.toList());
		System.out.println("map to list conversion" + mapToListConversion);
		System.out.println(
				"===============================================================================================");
		Set<Object> mapToSetConversion = map.entrySet().stream().collect(Collectors.toSet());
		System.out.println("map to set conversion" + mapToSetConversion);
		System.out.println(
				"===============================================================================================");
		Map<Integer,Object> setToMapConversion=set.stream().collect(Collectors.toMap(Employee::getEmpId, Function.identity()));
		System.out.println("set to map convirsion"+setToMapConversion);
		
	}

}
