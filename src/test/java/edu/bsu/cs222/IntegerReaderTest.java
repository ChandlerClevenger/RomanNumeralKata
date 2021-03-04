package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntegerReaderTest {
    @ParameterizedTest
    @CsvSource({"1,i", "2,ii", "3,iii", "4,iv", "5,v", "6,vi", "7,vii", "8,viii", "9,ix",
            "10,x", "99,xcix", "100,c", "3000,mmm", "2999,mmcmxcix"})
    public void TestNumberTranslate(int value, String romanNumeral) {
        IntegerReader integerReader = new IntegerReader();
        String actual = integerReader.read(value);
        Assertions.assertEquals(romanNumeral, actual);
    }
}
