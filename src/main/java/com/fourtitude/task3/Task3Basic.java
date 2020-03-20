package com.fourtitude.task3;

public class Task3Basic {
	public static void main(String[] args) {
		// Basic
		int counter = 0, currentPrime = 0;
		Lcg lcg = new Lcg(65536, 137, 1, 0);
		
		while (counter < 100) {
			int lcgValue = (int)lcg.next();
			if(isPrimeNum(lcgValue)) {
				currentPrime = lcgValue;
				++counter;
			}
		}
		System.out.println("The 100th prime number is: " + currentPrime);
	}
	
	private static boolean isPrimeNum(long longInput) {
		boolean result = true;
		int temp, input = (int)longInput;
		if(input < 2) {
			return false;
		}
		for(int i=2; i <= input/2; i++) {
			temp = input % i;
			if(temp == 0) {
				result = false;
				break;
		   }
		}
		return result;
	}
}
