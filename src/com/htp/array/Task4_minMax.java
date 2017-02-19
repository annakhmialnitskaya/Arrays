package com.htp.array;

public class Task4_minMax {

	public static void main(String[] args) {
		int[] numbers = { 8, 6, 0, -59 };
		int max = 0;
		int min = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[max] < numbers[i]) {
				max = i;
			}
			if (numbers[min] > numbers[i]) {
				min = i;
			}
		}

		printArray(numbers);
		System.out.println();

		int a = numbers[min];
		numbers[min] = numbers[max];
		numbers[max] = a;
		printArray(numbers);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
