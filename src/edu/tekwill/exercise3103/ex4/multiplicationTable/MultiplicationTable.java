package edu.tekwill.exercise3103.ex4.multiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1)));
        }
    }
}
