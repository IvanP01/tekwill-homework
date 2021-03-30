package edu.tekwill.exercise2603.ex3.internetServiceProvider;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What package do you have? (A, B or C): ");
        String userPackage = scanner.nextLine();
        System.out.print("How many hours did you use?:  ");
        float userNumberOfHours = scanner.nextFloat();
        float billPrice = 0;

        if (userNumberOfHours > 0) {
            if (userPackage.equalsIgnoreCase("A")) {
                billPrice = userNumberOfHours <= 10
                        ? 9.95f
                        : 9.95f + ((userNumberOfHours - 10) * 2);
            } else if (userPackage.equalsIgnoreCase("B")) {
                billPrice = userNumberOfHours <= 20
                        ? 13.95f
                        : 13.95f + ((userNumberOfHours - 20) * 1);

            } else if (userPackage.equalsIgnoreCase("C")) {
                billPrice = 19.95f;
            }
        }
        if (billPrice > 0) {
            System.out.println("Total charges for package you chose " + userPackage.toUpperCase() + " is: " + billPrice);
        } else System.out.println("You must provide a positive number of hours or a valid internet package");
    }
}