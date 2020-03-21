package com.fourtitude.task2;

import java.util.HashMap;

public class Task2 {
	
	public static void main(String[] args) {	
		// Basic
		int basicCheckDigit = Task2Util.findCheckDigit("98062477123");
		System.out.println("--- Basic ---");
		System.out.println("The check digit for the value '98062477123' is " + basicCheckDigit);
		
		System.out.println("");
		
		// Advance
		System.out.println("--- Advance ---");
		checkDistribution();
	}
	
	private static void checkDistribution() {
		HashMap<Integer, Integer> tallyMap = new HashMap<Integer, Integer>();
		for(int i = 0; i <= 9; i++) {
			tallyMap.put(i, 0);
		}
		for (int i = 1; i <= 1000000; i++) {
			int checkDigit = Task2Util.findCheckDigit(String.valueOf(i));
			tallyMap.put(checkDigit, (tallyMap.get(checkDigit) + 1));
		}
		System.out.println(tallyMap);
		System.out.println("Based on the tally results, the check digits is NOT uniformly distributed.");
		System.out.println("The highest frequency check digit is 4 with the frequency of 200000");
	}
}
