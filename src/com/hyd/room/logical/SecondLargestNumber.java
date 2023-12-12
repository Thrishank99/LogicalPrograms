package com.hyd.room.logical;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itr[]={55,11,25,8,45,4,2,55,2,3,442,0,551,2};
		int largest=itr[0];
		int secondlargest=itr[0];
		int thridlargest=itr[0];
		int sallestnumber=itr[0];
		for(int i=0;i<itr.length;i++){
			if(itr[i]>largest){
				secondlargest=largest;
				largest=itr[i];
			}
			else if(itr[i]>secondlargest){
				secondlargest=itr[i];
			}
			else if(itr[i]>thridlargest){
				thridlargest=itr[i];
			}
			else if(itr[i]<sallestnumber){
				sallestnumber=itr[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondlargest);
		System.out.println(thridlargest);
		System.out.println(sallestnumber);

	}

}
