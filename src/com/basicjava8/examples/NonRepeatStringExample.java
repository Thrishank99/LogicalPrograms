package com.basicjava8.examples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sreenivasarao";
		String firstNonRepeatCharacter=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
		.filter(s->s.getValue()==1).findFirst().get().getKey();
		System.out.println(firstNonRepeatCharacter);

	}

}
