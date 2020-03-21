package com.fourtitude.task1;

import java.text.DecimalFormat;

public class Task1Basic {
	
	public static void main(String[] args) {
		double principalAmount = 500000;
		double percentageRate = 4.45;
		int numOfYear = 30;
		
		System.out.println("RM " + calculateRepayment(principalAmount, percentageRate, numOfYear));
		
		principalAmount = 400000;
		numOfYear = 30;
		double repaymentAmount = 1500;
		System.out.println(calculateInterestRate(principalAmount, repaymentAmount, numOfYear) + "%");	
	}
	
	
	private static DecimalFormat df = new DecimalFormat("0.00000");
	
	public static String calculateRepayment(double principalAmount, double percentageRate, int numOfYear) {
		int numOfPayment = numOfYear * 12;
		double ratePerPeriod = percentageRate / 100 / 12;
		double repaymentAmount = principalAmount * (ratePerPeriod / (1 - Math.pow((1+ratePerPeriod), (-1*numOfPayment))));
		return df.format(repaymentAmount);
	}
	
	public static String calculateInterestRate(double principalAmount, double repaymentAmount, int numOfYear) {
		int numOfPayment = numOfYear * 12;
		double percentageRate = 0.33 * 0.33 ;
		System.out.println(Math.pow((1.0/3), 2));
		
		return df.format(percentageRate);
	}
	
	
}
