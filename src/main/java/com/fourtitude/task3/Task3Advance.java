package com.fourtitude.task3;

import java.util.Base64;
import java.util.Scanner;

public class Task3Advance {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a string to be encrypted: ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.println("Entered string: " + input);
			String encrypted = encrypt(input);
			System.out.println("String after encryption: " + encrypted);
			String decrypted = decrypt(encrypted);
			System.out.println("String after decryption: " + decrypted);
			scanner.close();
		} catch (Exception e) {
			System.out.println("Error occured during encryption/decryption.");
		}
		
	}
	
	public static String encrypt(String plainText) throws Exception {
		Lcg lcg = new Lcg(256, 11, 1, 0);
		byte[] bytes = plainText.getBytes("UTF-8");
		int len = bytes.length;
		byte[] xors = new byte[len];
		for (int ix = 0; ix < len; ix += 1) {
			xors[ix] = (byte) ((int) bytes[ix] ^ ((int) lcg.next()));
		}
		return new String(java.util.Base64.getEncoder().encode(xors), "UTF-8");
	}
	
	public static String decrypt(String base64EncodedValue) throws Exception {
		Lcg lcg = new Lcg(256, 11, 1, 0);
		byte[] decodedByte = Base64.getDecoder().decode(base64EncodedValue.getBytes("UTF-8"));		
		int len = decodedByte.length;
		byte[] xors = new byte[len];
		for (int ix = 0; ix < len; ix += 1) {
			xors[ix] = (byte) ((int) decodedByte[ix] ^ ((int) lcg.next()));
		}
		return new String(xors, "UTF-8");		
	}


}
