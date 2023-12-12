package com.hyd.room.logical;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 10, 8, 32, 8, 50, 250, 5 };
		int sum = 0;
		int sum2 = 0;
		for (int it : array) {

			sum = sum + it;

		}
		System.out.println(" for each loop Sum of array is " + sum);
		for (int i = 0; i < array.length; i++) {
			sum2  += array[i];

		}

		System.out.println(" for lloop Sum of array is " + sum2);
	}
}