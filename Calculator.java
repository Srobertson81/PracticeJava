package com.qa.startworld;

public class Calculator {

	public static void main(String[] args) {
		add(23, 56);
		subtract(96, 53);
		multiply(9, 5);
		divide(24, 6);
		doubleDiv(5.6d, 7.3d);

	}
	public static int add(int num1, int num2) {

		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
	public static int subtract(int num3, int num4) {

		int resultSub = num3 - num4;
		System.out.println(resultSub);
		return resultSub;
	}
	public static int multiply(int number5, int number6) {

		int resultMul = number5 * number6;
		System.out.println(resultMul);
		return resultMul;
	}
	public static int divide(int number7, int number8) {

		int resultDiv = number7 / number8;
		if (number7 > number8) {
			System.out.println(resultDiv);
		} else {
			System.out.println("This division can not be performed");
		}
		
		return resultDiv;
	}
	public static double doubleDiv(double number10, double number11) {

		double resultDoubleDiv = number10 / number11;
		System.out.println(resultDoubleDiv);
		return resultDoubleDiv;
	}
	

}
