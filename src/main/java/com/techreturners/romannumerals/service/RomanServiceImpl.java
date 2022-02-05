package com.techreturners.romannumerals.service;

import java.util.HashMap;
import java.util.Map;

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

	public int getNumericalNumberFormRomanNumber(String roamNumber) throws Exception {
		Map<String, Integer> romanMap = new HashMap<String, Integer>();
		String romanNumber = roamNumber.toUpperCase();
		int numericalNum = 0;
		try {
			for (RomanNumber roamNum : RomanNumber.values()) {
				romanMap.put(roamNum.romanNumber, roamNum.numbericalNumber);
			}
			for (int i = 0; i < romanNumber.length(); i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(romanNumber.charAt(i));
				if ((i + 1) < romanNumber.length()) {
					sb.append(romanNumber.charAt(i + 1));
					if (romanMap.get(sb.toString()) != null) {
						numericalNum += romanMap.get(sb.toString());
						i++;
					} else {
						if (romanMap.get(String.valueOf(romanNumber.charAt(i))) != null)
							numericalNum += romanMap.get(String.valueOf(romanNumber.charAt(i)));
					}
				} else {
					if (romanMap.get(sb.toString()) != null)
						numericalNum += romanMap.get(sb.toString());
					else
						throw new Exception("The given roman number doesn't exit");

				}
			}
		} catch (NullPointerException ne) {
			System.out.println("Null pointer exception in getNumericalNumberFormRomanNumber " + ne.getMessage());
		}catch(Exception e) {
			System.out.println("Exception occured in getNumericalNumberFormRomanNumber "+e.getMessage());
		}
		return numericalNum;
	}
}
