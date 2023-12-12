package com.hyd.room.logical;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sreenivasaraok";
		
	int length=str.length();
	for(int reverse=length-1;reverse>=0;reverse--){
		System.out.print(str.charAt(reverse));
	}

	}

}
