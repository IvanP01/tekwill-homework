package edu.tekwill.exercise2403.ex7.romanNumerals;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display
 * the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program
 *  should display an error message.
 * */

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.print("Input number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1)
            System.out.println("Roman numeral version of that number is: I");
        if (num == 2)
            System.out.println("Roman numeral version of that number is: II");
        if (num == 3)
            System.out.println("Roman numeral version of that number is: III");
        if (num == 4)
            System.out.println("Roman numeral version of that number is: IV");
        if (num == 5)
            System.out.println("Roman numeral version of that number is: V");
        if (num == 6)
            System.out.println("Roman numeral version of that number is: VI");
        if (num == 7)
            System.out.println("Roman numeral version of that number is: VII");
        if (num == 8)
            System.out.println("Roman numeral version of that number is: VIII");
        if (num == 9)
            System.out.println("Roman numeral version of that number is: IX");
        if (num == 10)
            System.out.println("Roman numeral version of that number is: X");
        if (num <= 0 || num >= 11)
            System.out.println("Error");

    }
}
