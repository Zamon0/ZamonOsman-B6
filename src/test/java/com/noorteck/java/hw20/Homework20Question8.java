package com.noorteck.java.hw20;

public class Homework20Question8 {
	public static void main(String[] args) {

		char resultOne = getCharacter("java training", 2);
		char resultTwo = getCharacter("java training", 5);
		char resultThree = getCharacter("java training", 8);
		char resultFour = getCharacter("java training", 22);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	public static char getCharacter(String strOne, int indexNum) {

		char result = ' ';

		if (indexNum > strOne.length()) {
			result = '?';
		} else {
			result = strOne.charAt(indexNum);
		}

		return result;    

	}

}
