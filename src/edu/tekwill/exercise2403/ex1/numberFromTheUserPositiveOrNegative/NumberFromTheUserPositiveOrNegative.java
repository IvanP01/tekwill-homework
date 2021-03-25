package edu.tekwill.exercise2403.ex1.numberFromTheUserPositiveOrNegative;


import java.util.Scanner;

/*1. Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive*/
public class NumberFromTheUserPositiveOrNegative {
    public static void main(String[] args) {
        System.out.print("Input number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0)
            System.out.println("Number is positive");

        else if (num < 0)
            System.out.println("Number is negative");

        else
            System.out.println("Oooops you number is zero!");


    }
}
