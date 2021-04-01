package edu.tekwill.exercise3103.ex2.calculatingSumOfAllTheIntegers;

import java.util.Scanner;

public class CalculatingSumOfAllTheIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, num1 = 0, num2 = 0, sum = 0;

        System.out.println("Input first number: ");
        num1 = scanner.nextInt();

        System.out.println("Input two number: ");
        num2 = scanner.nextInt();

        for (i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("The sum of all the integers between and including in " + num1 + " and " + num2 + " is: " + sum);
    }
}
