package com.techreturners.romannumerals.model;

public enum RomanNumber {
	ONE(1, "I"), TWO(2, "II"), THREE(3, "III"), FOUR(4, "IV"), FIVE(5, "V"), SIX(6, "VI"), SEVEN(7, "VII"),
	EIGHT(8, "VIII"), NINE(9, "IX"), TEN(10, "X"), FOURTEEN(14, "XIV"), TWENTY(20, "XX"), THIRTY(30, "XXX"),
	THIRTYNINE(39, "XXXIX"), FORTY(40, "XL"), FORTYNINE(49, "XLIX"), FIFTY(50, "L"), EIGHTY(80, "LXXX"),
	EIGHTYNINE(89, "LXXXIX"), NINETY(90, "XC"), NINETYNINE(99, "XCIX"), HUNDRED(100, "C"),
	THREENINENINE(399, "CCCXCIX"), FOURHUNDRED(400, "CD"), FIVENINENINE(499, "CDXCIX"), FIVEHUNDRED(500, "D"),
	EIGHTNINENINE(899, "DCCCXCIX"), NINEHUNDRED(900, "CM"), NINENINENINE(999, "CMXCIX"), THOUSAND(1000, "M"),
	THREETHOUSAND(3000, "MMM"), TWONINENINENINE(2999, "MMCMXCIX");

	public int numbericalNumber;
	public String romanNumber;

	RomanNumber(int numbericalNumber, String romanNumber) {
		this.numbericalNumber = numbericalNumber;
		this.romanNumber = romanNumber;

	}

}
