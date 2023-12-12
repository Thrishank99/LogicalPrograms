package com.strings.examples;

public class IntegerReverseEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=584795101;
		int reverse=0;
		while(number!=0){
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
System.out.println(reverse);
	}

}
