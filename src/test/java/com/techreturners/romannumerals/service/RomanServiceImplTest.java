package com.techreturners.romannumerals.service;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.techreturners.romannumerals.model.RomanNumber;

public class RomanServiceImplTest {
	RomanServiceImpl romanService;
	
	@BeforeEach
	public void setUp() {
		romanService = new RomanServiceImpl();

	}

	@ParameterizedTest
	@EnumSource(value = RomanNumber.class)
	public void getRomanNumberTest(RomanNumber romanNumber) {
		assertEquals(romanNumber.romanNumber, romanService.getRomanNumber(romanNumber.numbericalNumber));
	}
	
	@Test
	public void getRomanNumberFor0and3001Test() {
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(0));
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(3001));
	}
	
	

}
