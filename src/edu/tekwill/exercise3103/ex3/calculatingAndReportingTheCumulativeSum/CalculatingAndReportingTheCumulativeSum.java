package edu.tekwill.exercise3103.ex3.calculatingAndReportingTheCumulativeSum;

import java.util.Scanner;

public class CalculatingAndReportingTheCumulativeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter an Number: ");

        for (int userNUmber = in.nextInt(); userNUmber != 0; userNUmber = in.nextInt()) {
            sum += userNUmber;
            System.out.println("Sum of Integers is: " + sum);
        }
    }
}
