package com.techreturners.romannumerals.service;

public interface RomanService {
	int getNumericalNumberFormRomanNumber(String roamNumber) throws Exception;
	String getRomanNumber(int number);
}
