package com.strings.examples;

import java.util.Arrays;

public class LongestStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"java","java2","springboot1","springboot2"};
	String lorgestString=	Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
	System.out.println(lorgestString);

	}

}
