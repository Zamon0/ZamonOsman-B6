package com.noortech.javahw12;

public class Homework12Question1 {
	public static void main(String[] args) {
		boolean result = posNeg(1, -1);
		boolean resultTwo = posNeg(-1, 1);
		boolean resultThree = posNeg(-4, -5);

		System.out.println(result);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	public static boolean posNeg(int numA, int numB) {
		boolean result = false;

		if (numA < 0 && numB > 0) {
			result = true;

		} else if (numA > 0 && numB < 0) {

			result = true;

		} else if (numA < 0 && numB < 0) {
			result = true;
		}

		return result;
	}
}