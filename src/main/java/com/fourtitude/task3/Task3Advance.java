package com.fourtitude.task3;

import java.util.Base64;

public class Task3Advance {
	public static void main(String[] args) {
		String input = "haha";
		try {
			String encrypt = encrypt(input);
			
			decrypt(encrypt);
		} catch (Exception e) {
			System.out.println("Error during encryption/decryption.");
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
		
		String encry = new String(java.util.Base64.getEncoder().encode(xors), "UTF-8");
		
		byte[] aa = Base64.getEncoder().encode(xors);
		System.out.println(java.util.Base64.getEncoder().encode(xors));
		System.out.println(encry.getBytes("UTF-8"));
		
		return encry;
//		return new String(java.util.Base64.getEncoder().encode(xors), "UTF-8");
	}
	
	public static String decrypt(String base64EncodedValue) throws Exception {
		Lcg lcg = new Lcg(256, 11, 1, 0);
		byte[] decodedByte = Base64.getDecoder().decode(base64EncodedValue.getBytes("UTF-8"));
//		System.out.println(decodedByte);
//		System.out.println(base64EncodedValue.getBytes("UTF-8"));
		int len = decodedByte.length;
		byte[] newXors = new byte[len];
		for (int ix = 0; ix < len; ix += 1) {
			newXors[ix] = (byte) ((int) decodedByte[ix] ^ ((int) lcg.next()));
		}
		
		return (new String(newXors, "UTF-8"));
		
		
//	    throw new UnsupportedOperationException("TODO: to be implemented");
	}


}
