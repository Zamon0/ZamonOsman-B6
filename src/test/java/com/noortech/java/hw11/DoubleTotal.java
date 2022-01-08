package com.noortech.java.hw11;

public class DoubleTotal {
	public static void main(String[] args) {
		int myTotal = sumDouble(1, 2);
		int myTotal2 = sumDouble(2, 3);
		int myTotal3 = sumDouble(2, 2);

		System.out.println(myTotal);
		System.out.println(myTotal2);
		System.out.println(myTotal3);

	}

	public static int sumDouble(int valueOne, int valueTwo) {
		int result = 0;
		result = valueOne + valueTwo;
		if (valueOne == valueTwo) {
			result = (result * 2);
		} else if (valueOne != valueTwo) {
			result = (valueOne + valueTwo);

		}

		return result;

	}

}
