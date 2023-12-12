package com.hyd.room.logical;

public class FebonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=0;
		int a2=1;
		int a3;
		int count=15;
		for(int i=2;i<count;i++){
			a3=a1+a2;
			a1=a2;
			a2=a3;
		
System.out.println("Febonicseries:"+a3);
		}
	}

}
