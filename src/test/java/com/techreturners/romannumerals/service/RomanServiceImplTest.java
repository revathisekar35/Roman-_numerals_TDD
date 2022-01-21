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
	}

	@Test
	public void getRomanNumberFor0and3001Test() {
		RomanServiceImpl romanService = new RomanServiceImpl();
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(0));
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(3001));
	}

}
