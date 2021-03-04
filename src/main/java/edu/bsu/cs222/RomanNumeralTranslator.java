package edu.bsu.cs222;

public class RomanNumeralTranslator {
    public int convertRomanNumeralSymbol(char romanNumeral) {
        if (romanNumeral == 'i') {
            return 1;
        } else if (romanNumeral == 'v') {
            return 5;
        } else if (romanNumeral == 'x') {
            return 10;
        } else if (romanNumeral == 'l') {
            return 50;
        } else if (romanNumeral == 'c') {
            return 100;
        } else if (romanNumeral == 'd') {
            return 500;
        } else if (romanNumeral == 'm') {
            return 1000;
        }
        return 0;
    }
}
