package com.qa.startworld;
//import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] newArray = new int [10];
		
		newArray[0] = 3;
		newArray[1] = 4;
		newArray[2] = 3;
		newArray[3] = 8;
		newArray[4] = 9;
		newArray[5] = 5;
		newArray[6] = 1;
		newArray[7] = 3;
		newArray[8] = 4;
		newArray[9] = 6;
		for (int i = 0; i < newArray.length; i++)
		System.out.println(newArray[i]);
		System.out.println("End");
		
		int[] numbers = new int[20];
		for ( int i = 0; i <= 19; i++) {
			numbers[i] = i;
			
			System.out.println(i);
			System.out.println("EndEnd");
			}
		}
	
	public static int[] multiply(int[] numbers, int number)
	{
		int[] numbersY = new int[20];
		int array[] = new int[numbers.length];
		for( int i = 0; i < numbers.length; i++)
		{
			number = 10;
			numbersY[i] = numbers[i] * number;
		   System.out.println(array);
		}
		return array;

	}
			
	}


