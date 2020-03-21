package com.fourtitude.task1;

import java.text.DecimalFormat;

public class Task1Basic {
	
	public static void main(String[] args) {
		double principalAmount = 500000;
		double percentageRate = 4.45;
		int numOfYear = 30;
		
		System.out.println("RM " + calculateRepayment(principalAmount, percentageRate, numOfYear));
	}
		
	public static String calculateRepayment(double principalAmount, double percentageRate, int numOfYear) {
		DecimalFormat df = new DecimalFormat("0.00");
		int numOfPayment = numOfYear * 12;
		double ratePerPeriod = percentageRate / 100 / 12;
		double repaymentAmount = principalAmount * (ratePerPeriod / (1 - Math.pow((1+ratePerPeriod), (-1*numOfPayment))));
		return df.format(repaymentAmount);
	}
}
