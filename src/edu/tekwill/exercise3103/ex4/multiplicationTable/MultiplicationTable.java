package edu.tekwill.exercise3103.ex4.multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        final int number = scanner.nextInt();

        System.out.println("Please enter the number of times to multiply the number: ");
        final int timesToMultiplay = scanner.nextInt();

        for (int i = 1; i <= timesToMultiplay; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
