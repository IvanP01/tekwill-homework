package edu.tekwill.exercise2603.ex2.theSpeedOfSound;

import java.util.Scanner;

public class TheSpeedOfSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter air, water, or steel: ");
        String mediumFromUser = scanner.nextLine();

        System.out.println("Please enther the distance that the sound wave will travel in this medium: ");
        float distanceFromUser = scanner.nextFloat();
        float time = 0;

        if (mediumFromUser.equalsIgnoreCase("air")) {
            time = (distanceFromUser / 1100);
            System.out.println("The total time traveled is " + time);

        } else if (mediumFromUser.equalsIgnoreCase("water")) {
            time = (distanceFromUser / 4900);
            System.out.println("The total time traveled is " + time);

        } else if (mediumFromUser.equalsIgnoreCase("steel")) {
            time = (distanceFromUser / 16400);
            System.out.println("The total time traveled is " + time);
        } else {
            System.out.println("You either entered a unknown medium, either a negative or zero distance.");
        }
    }
}
