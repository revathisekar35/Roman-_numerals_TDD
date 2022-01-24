package com.techreturners.romannumerals.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.rules.ExpectedException;

import com.techreturners.romannumerals.model.RomanNumber;

public class RomanServiceImplTest {
	RomanServiceImpl romanService;
	
	@Before
	public void setUp() {
		romanService = new RomanServiceImpl();

	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@ParameterizedTest
	@EnumSource(value = RomanNumber.class)
	public void getRomanNumberTest(RomanNumber romanNumber) {
		RomanServiceImpl romanService = new RomanServiceImpl();
		assertEquals(romanNumber.romanNumber, romanService.getRomanNumber(romanNumber.numbericalNumber));
		assertEquals(romanNumber.romanNumber, romanService.getRomanNumber(romanNumber.numbericalNumber));
	}

	@Test
	public void getRomanNumberForOutOfRangeTest() {
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(0));
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(3001));
		assertEquals("Accepted value range : 1 - 3000.", romanService.getRomanNumber(-8));
	}

	@Test
	public void getRomanNumberForRandomNumberTest() {
		assertEquals("CMXCIX", romanService.getRomanNumber(999));
		assertEquals("MMM", romanService.getRomanNumber(3000));
		assertEquals("LXX", romanService.getRomanNumber(70));
		assertEquals("CDXCIX", romanService.getRomanNumber(499));
		assertEquals("MMD", romanService.getRomanNumber(2500));
		assertEquals("MMCMXCIX", romanService.getRomanNumber(2999));
	}
	
	@ParameterizedTest
	@EnumSource(value = RomanNumber.class)
	public void getNumericalNumberFormRomanNumberTest(RomanNumber romanNumber) throws Exception {
		RomanServiceImpl romanService = new RomanServiceImpl();
		assertEquals(romanNumber.numbericalNumber, romanService.getNumericalNumberFormRomanNumber(romanNumber.romanNumber));
		assertEquals(romanNumber.numbericalNumber, romanService.getNumericalNumberFormRomanNumber(romanNumber.romanNumber));
	}
	
	public void getNumericalNumberFormRomanNumberTestException(RomanNumber romanNumber) throws Exception {
		expectedEx.expect(Exception.class);
		expectedEx.expectMessage("Accepted value range is 1 - 3000 and given roman number doesn't exit");
		romanService.getNumericalNumberFormRomanNumber("XXXXX");
		}
	
	@Test
	public void getNumericalNumberFormRandomRomanNumberTest() throws Exception {
		assertEquals(2999, romanService.getNumericalNumberFormRomanNumber("MMCMXCIX"));
		assertEquals(560, romanService.getNumericalNumberFormRomanNumber("DLX"));
		assertEquals(1009, romanService.getNumericalNumberFormRomanNumber("MIX"));
		assertEquals(4, romanService.getNumericalNumberFormRomanNumber("IV"));
		assertEquals(4, romanService.getNumericalNumberFormRomanNumber("iv"));
		
	}

}
