package com.hyd.room.logical;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number=58565454-5+1;
		long reverse=0;
		while(number!=0){
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
System.out.println("Integer revese numbe is::"+reverse);
	}

}
