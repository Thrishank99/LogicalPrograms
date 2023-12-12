package com.strings.examples;

public class RemoveVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasarao";
		System.out.println("before removed vowels  "+str);
		String newString=str.replaceAll("[AELOUaeiou]", "");
		System.out.println("after removed vowels  "+newString);

	}

}
