package edu.tekwill.exercise2403.ex6.phoneKeyPads;

import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        System.out.print("Enter a letter: ");

        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();

        if (letter.contains("A"))
            System.out.println("The corresponding number is 2");
        if (letter.contains("B"))
            System.out.println("The corresponding number is 2");
        if (letter.contains("C"))
            System.out.println("The corresponding number is 2");

        if (letter.contains("D"))
            System.out.println("The corresponding number is 3");
        if (letter.contains("E"))
            System.out.println("The corresponding number is 3");
        if (letter.contains("F"))
            System.out.println("The corresponding number is 3");

        if (letter.contains("G"))
            System.out.println("The corresponding number is 4");
        if (letter.contains("H"))
            System.out.println("The corresponding number is 4");
        if (letter.contains("I"))
            System.out.println("The corresponding number is 4");

        if (letter.contains("J"))
            System.out.println("The corresponding number is 5");
        if (letter.contains("K"))
            System.out.println("The corresponding number is 5");
        if (letter.contains("L"))
            System.out.println("The corresponding number is 5");

        if (letter.contains("M"))
            System.out.println("The corresponding number is 6");
        if (letter.contains("N"))
            System.out.println("The corresponding number is 6");
        if (letter.contains("O"))
            System.out.println("The corresponding number is 6");

        if (letter.contains("P"))
            System.out.println("The corresponding number is 7");
        if (letter.contains("Q"))
            System.out.println("The corresponding number is 7");
        if (letter.contains("R"))
            System.out.println("The corresponding number is 7");
        if (letter.contains("S"))
            System.out.println("The corresponding number is 7");

        if (letter.contains("T"))
            System.out.println("The corresponding number is 8");
        if (letter.contains("U"))
            System.out.println("The corresponding number is 8");
        if (letter.contains("V"))
            System.out.println("The corresponding number is 8");

        if (letter.contains("W"))
            System.out.println("The corresponding number is 9");
        if (letter.contains("X"))
            System.out.println("The corresponding number is 9");
        if (letter.contains("Y"))
            System.out.println("The corresponding number is 9");
        if (letter.contains("Z"))
            System.out.println("The corresponding number is 9");



    }
}
