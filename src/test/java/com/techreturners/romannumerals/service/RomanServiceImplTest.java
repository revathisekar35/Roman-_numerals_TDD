package com.techreturners.romannumerals.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.techreturners.romannumerals.model.RomanNumber;

public class RomanServiceImplTest {

	@ParameterizedTest
	@EnumSource(value = RomanNumber.class)
	public void getRomanNumberTest(RomanNumber romanNumber) {
		RomanServiceImpl romanService = new RomanServiceImpl();
		assertEquals(romanNumber.romanNumber, romanService.getRomanNumber(romanNumber.numbericalNumber));
		assertEquals(romanNumber.romanNumber, romanService.getRomanNumber(romanNumber.numbericalNumber));
	}

	@Test
	public void getRomanNumberForOutOfRangeTest() {
		RomanServiceImpl romanService = new RomanServiceImpl();
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(0));
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(3001));
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(-8));
	}

	@Test
	public void getRomanNumberForRandomNumberTest() {
		RomanServiceImpl romanService = new RomanServiceImpl();
		assertEquals("CMXCIX", romanService.getRomanNumber(999));
		assertEquals("MMM", romanService.getRomanNumber(3000));
		assertEquals("LXX", romanService.getRomanNumber(70));
		assertEquals("CDXCIX", romanService.getRomanNumber(499));
		assertEquals("MMD", romanService.getRomanNumber(2500));
		assertEquals("MMCMXCIX", romanService.getRomanNumber(2999));
	}

}
