package com.noortech.java.hw11;

public class MonkeyStatus {
	public static void main(String[] args) {

		boolean aSmile = false;
		boolean bSmile = false;
		boolean result = monkeyTrouble(aSmile, bSmile);

		System.out.println(result);
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;

		if (aSmile == true && bSmile == true) {
			result = true;
		} else if (aSmile == false && bSmile == false) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
