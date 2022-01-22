package com.noorteck.java.hw20;

public class Homework20Question14 {

	public static void main(String[] args) {

		String str = "java training";

		System.out.println(str.substring(2, 6));

		String strTwo = "Software Development Engineer in TEST";
		System.out.println(strTwo.substring(11, 23));
		System.out.println(strTwo.substring(21, 29));

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";

		result = str.substring(startingIndex, endingIndex);

		return result;
	}
}
