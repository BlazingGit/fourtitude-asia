package com.fourtitude.task2;

public class Task2Util {
	
	public static int findCheckDigit(String input) {
		double sum = 0.0;
		for (int i = 0; i < input.length(); i++) {
			int digit = input.charAt(i) - '0';
			sum += digit;
			sum = (sum % 2 == 0) ? (sum / 2) : ((sum-1)/2);
		}
		return (int)sum;
	}
	
}
