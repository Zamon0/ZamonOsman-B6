package com.noorteck.java.hw20;

public class Homework20Question13 {
	public static void main(String[] args) {

		Homework20Question13 obj = new Homework20Question13();

		boolean resultOne = obj.isStartWith("java training", "ing");
		boolean resultTwo = obj.isStartWith("java training", "ja");
		boolean resultThree = obj.isStartWith("java training", "java");
		boolean resultFour = obj.isStartWith("java training", "train");

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	boolean isStartWith(String strOne, String strTwo) {

		boolean result = false;

		if (strOne.startsWith(strTwo))
			result = true;

		return result;

	}

}
