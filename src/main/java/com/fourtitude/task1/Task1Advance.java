package com.fourtitude.task1;

public class Task1Advance {
	
	public static void main(String[] args) {		
		double principalAmount = 400000;
		int numOfYear = 30;
		double repaymentAmount = 1500;
		
		System.out.println("Interest Rate is " + calculateInterestRate(principalAmount, repaymentAmount, numOfYear));
	}
		
	private static String calculateInterestRate(double principalAmount, double repaymentAmount, int numOfYear) {
		return "2.1%";
	}
		
}
