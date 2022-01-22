package com.noorteck.java.hw20;

public class Homework20Question12 {
	public static void main(String[] args) {

		String str = "I cannot do it";
		System.out.println(str.replace("cannot", "can"));

		String str2 = "Tomorrow is my day";
		System.out.println(str2.replace("Tomorrow", "Today"));

	}

	public static void replaceStr(String strOne, String oldStr, String newStr) {

		System.out.println();strOne.replace(oldStr, newStr);

	}
}
