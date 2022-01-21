package com.techreturners.romannumerals.service;

import com.techreturners.romannumerals.model.RomanNumber;

public class RomanServiceImpl implements RomanService {

	private final int MIN_NUM = 1;
	private final int MAX_NUM = 3000;

	public String getRomanNumber(int number) {
		StringBuilder roman = new StringBuilder();
		if (number >= MIN_NUM && number <= MAX_NUM) {
			for (RomanNumber roamNum : RomanNumber.values()) {
				while (number >= roamNum.numbericalNumber) {
					roman.append(roamNum.romanNumber);
					number -= roamNum.numbericalNumber;
				}
			}
		} else {
			roman.append("Accepted value range : 1 - 3000.");
		}
		return roman.toString();
	}

}
