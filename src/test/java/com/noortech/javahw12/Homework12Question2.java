package com.noortech.javahw12;

public class Homework12Question2 {
	public static void main(String[] args) {
		boolean resultOne = multipleof (3);
		boolean resultTwo =multipleof(10);
		boolean resultThree =multipleof(8);
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

}
	public static boolean multipleof(int zum1) {
		
		boolean result = false;
		
		if((zum1 % 3 ==0) || (zum1 % 5==0)) {
			result=true;
		
		}else {
			result=false;
		}
		
		
		return result;	
	
	}
}