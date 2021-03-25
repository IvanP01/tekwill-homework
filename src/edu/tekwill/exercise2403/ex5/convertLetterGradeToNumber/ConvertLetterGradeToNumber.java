package edu.tekwill.exercise2403.ex5.convertLetterGradeToNumber;

import java.util.Scanner;

public class ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        System.out.print("Enter a letter grade: ");

        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();

        if (letter.contains("A"))
            System.out.println("The Numeric value for grade " + letter + " is 4");
        if (letter.contains("B"))
            System.out.println("The Numeric value for grade " + letter + " is 3");
        if (letter.contains("C"))
            System.out.println("The Numeric value for grade " + letter + " is 2");
        if (letter.contains("D"))
            System.out.println("The Numeric value for grade " + letter + " is 1");
        if (letter.contains("F"))
            System.out.println("The Numeric value for grade " + letter + " is 0");
        if (letter.contains("T"))
            System.out.println(letter + " is an invalide grade");
    }
}
