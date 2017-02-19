package com.htp.array;

public class Task6 {

	public static void main(String[] args) {
		int[] numbers = { -9, 6, 0, -60 };
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2==0){
				sum=numbers[i]+sum;	
			}
			
		}

		System.out.println(sum);


	}

}
