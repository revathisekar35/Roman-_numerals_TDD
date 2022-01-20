package com.techreturners.romannumerals.service;

import com.techreturners.romannumerals.model.RomanNumber;

public class RomanServiceImpl implements RomanService {

	private final int MIN_NUM = 1;
	private final int MAX_NUM = 3000;

	public String getRomanNumber(int number) {
		StringBuffer sb = new StringBuffer();
		if (number >= MIN_NUM || number >= MAX_NUM) {
			while (number > 0) {
				if (number <= RomanNumber.THREE.numbericalNumber) {
					sb.append(RomanNumber.ONE.romanNumber);
					number -= 1;
				} else if (number == RomanNumber.FOUR.numbericalNumber) {
					sb.append(RomanNumber.FOUR.romanNumber);
					number -= RomanNumber.FOUR.numbericalNumber;
				} else if (number <= RomanNumber.EIGHT.numbericalNumber) {
					sb.append(RomanNumber.FIVE.romanNumber);
					number -= RomanNumber.FIVE.numbericalNumber;
				} else if (number == RomanNumber.NINE.numbericalNumber) {
					sb.append(RomanNumber.NINE.romanNumber);
					number -= RomanNumber.NINE.numbericalNumber;
				} else if (number == RomanNumber.NINE.numbericalNumber) {
					sb.append(RomanNumber.NINE.romanNumber);
					number -= RomanNumber.NINE.numbericalNumber;
				} else if (number >= RomanNumber.TEN.numbericalNumber
						&& number <= RomanNumber.THIRTYNINE.numbericalNumber) {
					sb.append(RomanNumber.TEN.romanNumber);
					number -= RomanNumber.TEN.numbericalNumber;
				} else if (number >= RomanNumber.FORTY.numbericalNumber
						&& number <= RomanNumber.FORTYNINE.numbericalNumber) {
					sb.append(RomanNumber.FORTY.romanNumber);
					number -= RomanNumber.FORTY.numbericalNumber;
				} else if (number >= RomanNumber.FIFTY.numbericalNumber
						&& number <= RomanNumber.EIGHTYNINE.numbericalNumber) {
					sb.append(RomanNumber.FIFTY.romanNumber);
					number -= RomanNumber.FIFTY.numbericalNumber;
				} else if (number >= RomanNumber.NINETY.numbericalNumber
						&& number <= RomanNumber.NINETYNINE.numbericalNumber) {
					sb.append(RomanNumber.NINETY.romanNumber);
					number -= RomanNumber.NINETY.numbericalNumber;
				} else if (number >= RomanNumber.HUNDRED.numbericalNumber
						&& number <= RomanNumber.THREENINENINE.numbericalNumber) {
					sb.append(RomanNumber.HUNDRED.romanNumber);
					number -= RomanNumber.HUNDRED.numbericalNumber;
				} else if (number >= RomanNumber.FOURHUNDRED.numbericalNumber
						&& number <= RomanNumber.FIVENINENINE.numbericalNumber) {
					sb.append(RomanNumber.FOURHUNDRED.romanNumber);
					number -= RomanNumber.FOURHUNDRED.numbericalNumber;
				} else if (number >= RomanNumber.FIVEHUNDRED.numbericalNumber
						&& number <= RomanNumber.EIGHTNINENINE.numbericalNumber) {
					sb.append(RomanNumber.FIVEHUNDRED.romanNumber);
					number -= RomanNumber.FIVEHUNDRED.numbericalNumber;
				} else if (number >= RomanNumber.NINEHUNDRED.numbericalNumber
						&& number <= RomanNumber.NINENINENINE.numbericalNumber) {
					sb.append(RomanNumber.NINEHUNDRED.romanNumber);
					number -= RomanNumber.NINEHUNDRED.numbericalNumber;
				} else if (number >= RomanNumber.THOUSAND.numbericalNumber
						&& number <= RomanNumber.THREETHOUSAND.numbericalNumber) {
					sb.append(RomanNumber.THOUSAND.romanNumber);
					number -= RomanNumber.THOUSAND.numbericalNumber;
				}
			}
		} else {
			sb.append("Accepted value range : 1 - 3000.");
		}
		return sb.toString();
	}
	/*
	 * private void covertNumberToRoman(StringBuffer sb,String romanNum,int
	 * numericalNum,int number) { sb.append(romanNum); number -= numericalNum; }
	 */

}
