package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralTranslatorTest {
    @ParameterizedTest
    @CsvSource({"i,1", "v,5", "x,10", "l,50", "c,100", "d,500", "m,1000"})
    public void testTranslate(char romanNumeral, int value) {
        RomanNumeralTranslator translator = new RomanNumeralTranslator();
        int actual = translator.convertRomanNumeralSymbol(romanNumeral);
        Assertions.assertEquals(value, actual);
    }
}
