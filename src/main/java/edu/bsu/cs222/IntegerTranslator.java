package edu.bsu.cs222;

public class IntegerTranslator {
    public String convertFirstDigit(String number) {
        return switch (number) {
            case "0" -> "";
            case "1" -> "i";
            case "2" -> "ii";
            case "3" -> "iii";
            case "4" -> "iv";
            case "5" -> "v";
            case "6" -> "vi";
            case "7" -> "vii";
            case "8" -> "viii";
            case "9" -> "ix";
            default -> null;
        };
    }

    public String convertSecondDigit(String number) {
        return switch (number) {
            case "0" -> "";
            case "1" -> "x";
            case "2" -> "xx";
            case "3" -> "xxx";
            case "4" -> "xl";
            case "5" -> "l";
            case "6" -> "lx";
            case "7" -> "lxx";
            case "8" -> "lxxx";
            case "9" -> "xc";
            default -> null;
        };
    }

    public String convertThirdDigit(String number) {
        return switch (number) {
            case "0" -> "";
            case "1" -> "c";
            case "2" -> "cc";
            case "3" -> "ccc";
            case "4" -> "cd";
            case "5" -> "d";
            case "6" -> "dc";
            case "7" -> "dcc";
            case "8" -> "dccc";
            case "9" -> "cm";
            default -> null;
        };
    }

    public String convertFourthDigit(String number) {
        return switch (number) {
            case "0" -> "";
            case "1" -> "m";
            case "2" -> "mm";
            case "3" -> "mmm";
            default -> null;
        };
    }
}
