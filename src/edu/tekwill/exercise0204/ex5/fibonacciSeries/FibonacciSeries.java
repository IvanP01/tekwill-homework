package edu.tekwill.exercise0204.ex5.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        int curent = 0, beforeCurent = 1, nextTerm;
        for (int i = 1; i <= numberOfTerms; ++i) {
            System.out.print(curent + " ");
            nextTerm = curent + beforeCurent;
            beforeCurent = curent;
            curent = nextTerm;
        }
    }
}
    

