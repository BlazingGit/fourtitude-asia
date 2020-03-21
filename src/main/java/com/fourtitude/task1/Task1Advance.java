package com.fourtitude.task1;

import java.text.DecimalFormat;

public class Task1Advance {
	
	public static void main(String[] args) {		
		double principalAmount = 400000;
		int numOfYear = 30;
		double repaymentAmount = 1500;
		
		System.out.println(calculateInterestRate(principalAmount, repaymentAmount, numOfYear) + "%");	
	}
		
	public static String calculateInterestRate(double principalAmount, double repaymentAmount, int numOfYear) {
		DecimalFormat df = new DecimalFormat("0.00000");
		int numOfPayment = numOfYear * 12;
		double percentageRate = 0.33 * 0.33 ;
		System.out.println(Math.pow((1.0/3), 2));
		
		return df.format(percentageRate);
	}
	
	
}
