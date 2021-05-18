package com.qa.startworld;

public class Stringdemo {

	public static void main(String args[]) {
		String strA = "yesterday it was raining";
        String strB = "today it is sunny";
        
        System.out.println(strA.toUpperCase()+", "+strB.toUpperCase());
        
        String subString1 = strB.substring(0, 11);
        String subString2 = strA.substring(16, 24);
        
        System.out.println(subString1.toUpperCase() + subString2.toUpperCase());
        
        System.out.println("string length is: " + strB.length());
	}
	

}
