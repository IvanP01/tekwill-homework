package edu.tekwill.exercise2603.ex2.theSpeedOfSound;

import java.util.Scanner;

public class TheSpeedOfSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance: ");
       // System.out.print("Enter air, water, or steel: ");

        String userInputDistance , air, water, steel;
       // String air = scanner.nextLine();
      //  String water = scanner.nextLine();
     //   String steel = scanner.nextLine();

        int distance, time;
        distance = scanner.nextInt();
        userInputDistance = scanner.nextLine();

        if (userInputDistance.equalsIgnoreCase("air")) {
            time = (distance / 1100);
            System.out.println("The total time traveled is " + time);
        } else if (userInputDistance.equalsIgnoreCase("water")) {
            time = (distance / 4900);
            System.out.println("The total time traveled is " + time);
        } else if (userInputDistance.equalsIgnoreCase("steel")) {
            time = (distance / 16400);
            System.out.println("The total time traveled is " + time);
        }
    }
}
