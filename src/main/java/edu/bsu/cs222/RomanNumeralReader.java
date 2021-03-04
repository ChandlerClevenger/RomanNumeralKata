package edu.bsu.cs222;

public class RomanNumeralReader {

    public int read(String romanNumeral) {
        RomanNumeralTranslator romanNumeralTranslator = new RomanNumeralTranslator();


        int length = romanNumeral.length();
        int total = 0;
        for (int i = 0; i < length; i++) {
            int currentSymbolValue = romanNumeralTranslator.convertRomanNumeralSymbol(romanNumeral.charAt(i));
            if (((i + 1) < length)) {
                int nextSymbolValue = romanNumeralTranslator.convertRomanNumeralSymbol(romanNumeral.charAt(i + 1));
                if (currentSymbolValue < nextSymbolValue) {
                    total -= currentSymbolValue;
                } else {
                    total += currentSymbolValue;
                }
            } else {
                total += currentSymbolValue;
            }
        }
        return total;
    }
}
