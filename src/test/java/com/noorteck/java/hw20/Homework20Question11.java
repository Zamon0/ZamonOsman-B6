package com.noorteck.java.hw20;

public class Homework20Question11 {
	public static void main(String[] args) {

		Homework20Question11 obj = new Homework20Question11();

		String resultOne = obj.threeEqual("Java Pro", 'P', 'B');
		String resultTwo = obj.threeEqual("Lazy Mode", 'M', 'C');
		String resultThree = obj.threeEqual("Training", 'T', ' ');

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";

		result = str.replace(oldChar, newChar);

		return result;
	}

}
