package edu.tekwill.exercise0204.ex7.seriesOfSum;

import java.util.Scanner;

public class SerieOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.print("Please enter the number of terms: ");
        int numberOfterms = scanner.nextInt();
        int number = 0;
        for (int i = 1; i <= numberOfterms; ++i) {
            System.out.print((number * 10 + 2) + " + " + "");
            number = number * 10 + 2;
            sum += number;
        }
        System.out.println();
        System.out.println("Our sum is: " + sum);
    }
}
