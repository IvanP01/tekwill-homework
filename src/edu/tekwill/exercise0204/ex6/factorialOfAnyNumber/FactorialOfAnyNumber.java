package edu.tekwill.exercise0204.ex6.factorialOfAnyNumber;

import java.util.Scanner;

public class FactorialOfAnyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nfact = 1;
        System.out.print("Please enter a number to calculate factorial: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            nfact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + nfact);

    }
}
