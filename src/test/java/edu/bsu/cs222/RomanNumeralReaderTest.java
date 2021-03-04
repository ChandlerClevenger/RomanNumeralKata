package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralReaderTest {
    @ParameterizedTest
    @CsvSource({"i,1","ii,2","iii,3","iv,4","v,5","vi,6","vii,7","viii,8","ix,9",
            "x,10","xcix,99","c,100","mmm,3000","mmcmxcix,2999","clxxxix, 189" })
    public void testTranslate(String romanNumeral, int value) {
        RomanNumeralReader romanNumeralReader = new RomanNumeralReader();
        int actual = romanNumeralReader.read(romanNumeral);
        Assertions.assertEquals(value, actual);
    }
}