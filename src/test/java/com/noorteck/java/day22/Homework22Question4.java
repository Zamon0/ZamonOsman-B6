package com.noorteck.java.day22;

public class Homework22Question4 {

	public static void main(String[] args) {
	    
		System.out.println(getSubStr(null, 2,6));
		System.out.println(getSubStr("java training", 2, 6));
		System.out.println(getSubStr("Software Devolpment Engineer in TEST",11,23));
		
	}
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";
		
		if(str !=null) {
			result = str.substring(startingIndex, endingIndex);
			
		}else {
			result ="null";
			
		}
		return result;
	}
}
