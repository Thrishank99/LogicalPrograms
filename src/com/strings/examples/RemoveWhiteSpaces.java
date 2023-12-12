package com.strings.examples;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="    naven reddy ";
		String s=str.replaceAll("\\s+", "");
		System.out.println(s);

	}

}
