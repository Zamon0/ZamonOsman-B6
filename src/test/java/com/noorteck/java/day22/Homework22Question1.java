package com.noorteck.java.day22;

public class Homework22Question1 {

	public static void main(String[] args) {

		Homework22Question1 obj = new Homework22Question1();

		String resultOne = obj.toUpper("Pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper(null);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	String toUpper(String strOne) {
		String result = "";

		if (strOne == null) {
			System.out.println("null");

		} else {
			result = strOne.toUpperCase();
		}

		return result;
	}
}
