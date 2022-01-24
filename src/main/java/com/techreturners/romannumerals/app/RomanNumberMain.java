package com.techreturners.romannumerals.app;

import com.techreturners.romannumerals.service.RomanServiceImpl;

public class RomanNumberMain {

	public static void main(String[] args) throws Exception {
		RomanServiceImpl rom = new RomanServiceImpl();
		System.out.println("Convert 440 into roman number:\n");
		System.out.println(rom.getRomanNumber(440));
		System.out.println("\nConvert CDXL into numerical number:\n");
		System.out.println(rom.getNumericalNumberFormRomanNumber("CDXL"));
	}

}
