package com.convertion.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterArrayStartswithSomeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int itr[]= {54,10,2,12,78,1,59,19};
		List<String> value=Arrays.stream(itr).boxed().map(s->s+ "").filter(x->x.startsWith("5")).collect(Collectors.toList());
		
		
		System.out.println(value);
		
	}

}
