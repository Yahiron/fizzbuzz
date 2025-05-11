package com.example.springtutorial.service;

/**
 * 3の倍数ならfizz、5の倍数ならbuzz、15の倍数ならfizzbuzz、それ以外は数字を返却する.
 */
public class FizzbuzzService {

	public String fizzbuzz(int i) {
		if (i % 15 == 0) {
			return "fizzbuzz";
		} else if (i % 3 == 0) {
			return "fizz";
		} else if (i == 5 || i == 10 || i == 20) {
			return "buzz";
		}
		return String.valueOf(i);
	}

}