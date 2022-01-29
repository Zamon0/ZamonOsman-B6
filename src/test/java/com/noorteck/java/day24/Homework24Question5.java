package com.noorteck.java.day24;

public class Homework24Question5 {

	public static void main(String[] args) {
		Homework24Question5 obj = new Homework24Question5();
		int[] n1 = { 6, 1, 2, 3 };
		int[] resultN1 = obj.getDouble(n1);
		
		int[] n2 = {13,3};
		int[] resultN2 =obj.getDouble(n2);
		
		int[] n3 = {0,1,4};
		int[] resultN3 = obj.getDouble(n3);
		
		int[] n4 = {6};
		int[] resultN4 = obj.getDouble(n4);
		
		

		

		
		System.out.println("["+resultN1[0]+"," + resultN1[1] + "," + resultN1[2] + "," + resultN1[3] + "," + resultN1[4] + "," + resultN1[5] + "," + resultN1[6] + "," + resultN1[7] + "]");
		System.out.println("["+resultN2[0]+"," + resultN2[1] + "," + resultN2[2] + "," + resultN2[3] +"]");
		System.out.println("["+resultN3[0]+"," + resultN3[1] + "," + resultN3[2] + "," + resultN3[3] + "," + resultN3[4] + "," + resultN3[5] + "]");
		System.out.println("["+resultN4[0]+"," + resultN4[1] + "]");
	}   

	private int[] getDouble(int[] number) {
		int[] result = new int[(number.length) * 2];

		for (int i = 0; i < result.length; i++) {
             if (result.length < (result.length - 1)) {
				result[i] = 0;
			}
		}
		result[result.length-1]=number[number.length-1];

		return result;
	}
}
