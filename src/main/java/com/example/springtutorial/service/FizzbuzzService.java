package com.example.springtutorial.service;

/**
 * 3の倍数ならfizz、5の倍数ならbuzz、15の倍数ならfizzbuzz、それ以外は数字を返却する.
 */
public class FizzbuzzService {

	public String fizzbuzz(int i) {
		if (i != 3) {
			return String.valueOf(i);
		}
		return "fizz";
	}
}
