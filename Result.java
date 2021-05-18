package com.qa.startworld;

public class Result {

		public static double Physics = 90;
		public static double Chemistry = 120;
		public static double Biology = 63;
		public static double total = Physics + Chemistry + Biology;
		public static double overAllAvg = total * 100 / 450;
		

		public static void main(String[] args) {
			double percent = 60;
			System.out.println(percent);
			System.out.println("Physics Score:" + Physics);
			System.out.println("Chemistry Score:" + Chemistry);
			System.out.println("Biology Score:" + Biology);
			System.out.println("Total Score:" + total);
			System.out.println(overAllAvg);
			
			if( overAllAvg >= 60 && Physics >=60 && Chemistry >=60 && Biology >= 60) {
				System.out.println("You passed congrats!!");
			} else {
				System.out.println("You failed one or more subjects sorry");
			}
		}

}
