package com.noorteck.java.day22;

public class Homework22Question6 {
	public static void main(String[] args) {
		
	
  Homework22Question6 obj = new Homework22Question6();
  System.out.println(obj.endsWithNG(null));
  System.out.println(obj.endsWithNG("I like to practice"));
  System.out.println(obj.endsWithNG("Everyone is practicing"));
  System.out.println(obj.endsWithNG("I am studying"));
}
	public boolean endsWithNG(String strOne) {
		boolean result = false;
		
		if(strOne != null) {
			result = strOne.endsWith("ng");
		}
		return result;
	}
}