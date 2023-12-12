package com.dublicates.examples;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurencewithJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasarao";
	Map<String, Long> map=	Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);

	}

}
