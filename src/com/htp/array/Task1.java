package com.htp.array;

public class Task1 {

	public static void main(String[] args) {

		int[] array =new int[10];
		
		array[0]=1;
		for(int i=1;i<array.length;i++){
			array[i]=array[i-1]+2;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			
			if(i!=9){
				System.out.print(",");	
			}
		}

	}

}
