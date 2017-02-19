package com.htp.array;

public class Task5 {

	public static void main(String[] args) {
		int[] numbers = { -9, 6, 0, -59 };
		double sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum=numbers[i]+sum;
		}

		System.out.println(sum/numbers.length);

	}

}
