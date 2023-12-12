package com.hyd.room.logical;

public class ArrayLargestSmallestNumber {

	public static void main(String[] args) {
		int number[]={85,32,12,5,52,56,5,55,5,5,02,36,25,025,888,512,989,7};
	
		int largest=number[1];
		int smallest=number[2];
		for(int i=0;i<number.length;i++){
			if(number[i]>largest){
				largest=number[i];
			}
				else if(number[i]<smallest){
				smallest=number[i];}
			}
		System.out.println("largest number is +;;;;"+largest);
		System.out.println("smallest number is +;;;"+smallest);
		}

	}


