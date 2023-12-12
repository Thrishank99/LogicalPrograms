package com.hyd.room.logical;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumberWithJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int itr[]= {8,5,2,85,96,5,74,5,6,74,85,98,850,900,785};
		
	int secondHigestValue=Arrays.stream(itr).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
	System.out.println(secondHigestValue);

	}

}
