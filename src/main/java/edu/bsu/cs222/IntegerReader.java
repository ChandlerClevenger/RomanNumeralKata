package edu.bsu.cs222;

public class IntegerReader {
    public String read(int input) {
        String number = Integer.toString(input);
        IntegerTranslator integerTranslator = new IntegerTranslator();

        String result = "";
        String firstDigit, secondDigit, thirdDigit, fourthDigit;

        if (Integer.parseInt(number) < 10) {
            result += integerTranslator.convertFirstDigit(number);
            return result;
        } else if (Integer.parseInt(number) < 100) {
            firstDigit = String.valueOf(number.charAt(0));
            secondDigit = String.valueOf(number.charAt(1));

            result += integerTranslator.convertSecondDigit(firstDigit);
            result += integerTranslator.convertFirstDigit(secondDigit);
            return result;
        } else if (Integer.parseInt(number) < 1000) {
            firstDigit = String.valueOf(number.charAt(2));
            secondDigit = String.valueOf(number.charAt(1));
            thirdDigit = String.valueOf(number.charAt(0));

            result += integerTranslator.convertThirdDigit(thirdDigit);
            result += integerTranslator.convertSecondDigit(secondDigit);
            result += integerTranslator.convertFirstDigit(firstDigit);
            return result;
        } else if (Integer.parseInt(number) < 4000) {
            firstDigit = String.valueOf(number.charAt(3));
            secondDigit = String.valueOf(number.charAt(2));
            thirdDigit = String.valueOf(number.charAt(1));
            fourthDigit = String.valueOf(number.charAt(0));

            result += integerTranslator.convertFourthDigit(fourthDigit);
            result += integerTranslator.convertThirdDigit(thirdDigit);
            result += integerTranslator.convertSecondDigit(secondDigit);
            result += integerTranslator.convertFirstDigit(firstDigit);
            return result;
        } else {
            return "Please enter a number below 4000";
        }
    }
}
