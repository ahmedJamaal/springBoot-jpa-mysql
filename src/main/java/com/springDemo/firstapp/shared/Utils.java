package com.springDemo.firstapp.shared;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	private final Random RANDOM = new SecureRandom();
	private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private final int Length=30;
	/*
	 * private final int ITERATION=10000; private final int KEY_LENGHT=256;
	 */
	public String generateUserId() {
		return generateRandomString();
	}

	private String generateRandomString() {
		// TODO Auto-generated method stub
		StringBuilder id = new StringBuilder();

		for (int i = 0; i < Length; i++) {
			id.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		return new String(id);
	}

}
