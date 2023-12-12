package com.hyd.room.logical;

public class LengthOfIntAndString {

	public static void main(String[] args) {
		int length[]={55,2,1,5,4,6,5,2,4,8,5,7,7,1};
		String lengthstr[]={"srinu","durga","naresh","ab",""};
		int itr=length.length;
		System.out.println(itr);
	int	lengthstring=0;
		for(int it=0;it<=lengthstr.length;it++){
			lengthstring=it;
		}
		System.out.println("string length is "+ lengthstring);
		for(String foreachlength:lengthstr){
			lengthstring=lengthstr.length;
		}
		System.out.println(" for each loop string length is "+ lengthstring);
	}

}
