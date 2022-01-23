package com.noorteck.java.hw20;

public class Homework20Question16 {
	public static void main(String[] args) {

		Homework20Question16 obj = new Homework20Question16();

		String resultOne = obj.concatString("Java", "awesome");

		String resultTwo = obj.concatString("food", "door");

		String resultThree = obj.concatString("java", "training");

		String resultFour = obj.concatString("pro", "ogress");

		System.out.println(resultOne);

		System.out.println(resultTwo);

		System.out.println(resultThree);

		System.out.println(resultFour);

	}

	String concatString(String strOne, String strTwo) {

		String result = "";

		char lastChar = strOne.charAt(strOne.length() - 1);
		char firstChar = strTwo.charAt(0);

		if (lastChar == firstChar) {
			result = strOne.concat(strTwo.substring(1));
		} else {

			result = strOne.concat(strTwo);

		}

		return result;      
	}

}
