package com.noorteck.java.hw20;

public class Homework20Question8 {
	public static void main(String[] args) {

		String str = "java training";

		System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(8));
		System.out.println(str.charAt(22));

	}

	static char getCharacter(String strOne, int indexNum) {
		char result = ' ';

		result = strOne.charAt(indexNum);
        

		
		return result;

	}
}
