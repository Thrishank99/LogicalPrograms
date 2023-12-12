package com.dublicates.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDublicatewithJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sreenivasarao";
		List<String> dublicatesinString=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
		.filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		
		System.out.println(dublicatesinString);
		
		List<String> uniqueinString=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
				.filter(s->s.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
				
				System.out.println(uniqueinString);

	}

}
