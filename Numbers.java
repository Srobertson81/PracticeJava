package com.qa.startworld;

public class Numbers {
	
	public static int findSum(int [] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int [] arr = {2, 5};
		int sum = findSum(arr);
	System.out.println("Sum of all digits is: " + sum);
		}
	}
	
