package edu.bsu.cs222;

import java.util.Scanner;

public class RomanNumeralParser {
    public static void main(String[] args) {
        RomanNumeralReader romanNumeralReader = new RomanNumeralReader();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 'q' to quit");
        while (true) {
            System.out.print("Enter in a Roman Numeral >>> ");
            String enteredRomanNumeral = keyboard.nextLine();
            if (enteredRomanNumeral.equals("q")) {
                System.out.println("Goodbye");
                break;
            }
            System.out.println(romanNumeralReader.read(enteredRomanNumeral));
        }
    }
}
