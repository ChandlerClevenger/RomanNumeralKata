package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerTranslatorTest {
    IntegerTranslator integerTranslator = new IntegerTranslator();

    @ParameterizedTest
    @CsvSource({"0, ''", "1,i", "2,ii", "3,iii", "4,iv", "5,v", "6,vi", "7,vii", "8,viii", "9,ix"})
    public void TestConvertFirstDigit(String value, String romanNumeral) {
        String actual = integerTranslator.convertFirstDigit(value);
        Assertions.assertEquals(romanNumeral, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, ''", "1,x", "2,xx", "3,xxx", "4,xl", "5,l", "6,lx", "7,lxx", "8,lxxx", "9,xc"})
    public void TestConvertSecondDigit(String value, String romanNumeral) {
        String actual = integerTranslator.convertSecondDigit(value);
        Assertions.assertEquals(romanNumeral, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, ''", "1,c", "2,cc", "3,ccc", "4,cd", "5,d", "6,dc", "7,dcc", "8,dccc", "9,cm"})
    public void TestConvertThirdDigit(String value, String romanNumeral) {
        String actual = integerTranslator.convertThirdDigit(value);
        Assertions.assertEquals(romanNumeral, actual);
    }

    @ParameterizedTest
    @CsvSource({"0, ''", "1,m", "2,mm", "3,mmm"})
    public void TestConvertFourthDigit(String value, String romanNumeral) {
        String actual = integerTranslator.convertFourthDigit(value);
        Assertions.assertEquals(romanNumeral, actual);
    }
}
