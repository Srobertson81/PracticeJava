package com.qa.startworld;

public class newarray {

	public static void main(String[] args) {
		newArray();
		

	}
	public static void newArray() {
		System.out.println("hi");
		
		int[] array = new int[10];
		
		for(int a = 0; a < array.length; a++) {
			array[a] = a + 1;
			System.out.println(array[a] + " ");
		}
		
		System.out.println(" ");
		
		for(int a = 0; a < array.length; a++) {
			array[a] = array[a] * 10;
			System.out.println(array[a] + " ");
		}
	}

}
