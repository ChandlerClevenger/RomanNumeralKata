package edu.bsu.cs222;

public class RomanNumeralReader {

    public int read(String romanNumeral) {
        RomanNumeralTranslator romanNumeralTranslator = new RomanNumeralTranslator();


        int length = romanNumeral.length();
        int total = 0;
        for (int i = 0; i < length; i++) {
            if (((i + 1) < length)) {
                if (romanNumeralTranslator.convertRomanNumeralValue(romanNumeral.charAt(i)) < romanNumeralTranslator.convertRomanNumeralValue(romanNumeral.charAt(i + 1))) {
                    total += (-1) * romanNumeralTranslator.convertRomanNumeralValue(romanNumeral.charAt(i));
                } else {
                    total += romanNumeralTranslator.convertRomanNumeralValue(romanNumeral.charAt(i));
                }
            } else {
                total += romanNumeralTranslator.convertRomanNumeralValue(romanNumeral.charAt(i));
            }
        }
        return total;
    }
}
