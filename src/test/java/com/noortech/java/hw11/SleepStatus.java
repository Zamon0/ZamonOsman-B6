package com.noortech.java.hw11;

public class SleepStatus {
	public static void main(String[] args) {

		boolean weekday = true;
		boolean vacation = true;

		boolean amIsleeping = sleepIn(weekday, weekday);
		System.out.println(amIsleeping);

		boolean amIsleeping2 = sleepIn(weekday, vacation);
		System.out.println(amIsleeping2);

		boolean amIsleeping3 = sleepIn(vacation, vacation);
		System.out.println(amIsleeping3);
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		boolean sleepIn = false;

		if (!isWeekday || isVacation) {
			sleepIn = true;
		} else {
			sleepIn = false;
		}
		return sleepIn; 
	}

}
