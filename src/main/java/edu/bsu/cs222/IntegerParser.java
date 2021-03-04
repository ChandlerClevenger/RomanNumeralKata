package edu.bsu.cs222;

import java.util.Scanner;

public class IntegerParser {
    public static void main(String[] args) {
        IntegerReader integerReader = new IntegerReader();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 'q' to quit");
        while (true) {
            System.out.print("Enter in an Integer >>> ");
            String enteredInteger = keyboard.nextLine();
            if (enteredInteger.equals("q")) {
                System.out.println("Goodbye");
                break;
            }
            System.out.println(integerReader.read(Integer.parseInt(enteredInteger)));
        }
    }
}
