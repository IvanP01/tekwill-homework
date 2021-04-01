package edu.tekwill.exercise3103.ex3.calculatingAndReportingTheCumulativeSum;

import java.util.Scanner;

public class CalculatingAndReportingTheCumulativeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, num1, num2, sum = 0;

        System.out.print("Enter First Number: ");
        num1 = in.nextInt();

        System.out.print("Enter Second Nmber: ");
        num2 = in.nextInt();

        //Aici am nevoie de ajutor
        for (i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("Result is: " + sum);
    }
}
