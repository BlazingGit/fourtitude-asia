package com.fourtitude.task3;

public class Task3Advance {
	public static void main(String[] args) {
		String input = "haha";
		try {
			String encrypt = encrypt(input);
			System.out.println(encrypt);
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
		return new String(java.util.Base64.getEncoder().encode(xors), "UTF-8");
	}
	
	public static String decrypt(String base64EncodedValue) throws Exception {
	    throw new UnsupportedOperationException("TODO: to be implemented");
	}


}
