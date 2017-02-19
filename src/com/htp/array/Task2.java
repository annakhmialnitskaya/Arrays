package com.htp.array;

public class Task2 {

	public static void main(String[] args) {
		int[] numbers = { -9, 6, 0, -59 };
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		System.out.println(max);

	}

}
