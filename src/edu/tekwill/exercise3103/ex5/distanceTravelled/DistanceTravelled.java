package edu.tekwill.exercise3103.ex5.distanceTravelled;

import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vehicleSpeed, distanceTravelled;
        int numberOfHours;

        System.out.print("Please enter speed of vehicle(in miles-per-hour): ");
        vehicleSpeed = scanner.nextDouble();

        System.out.print("Please enter the number of hours the vehicle has travelled: ");
        numberOfHours = scanner.nextInt();

        for (int hour = 1; hour <= numberOfHours; hour++) {
            distanceTravelled = hour * vehicleSpeed;
            System.out.println(hour + "   " + distanceTravelled);
        }
    }
}
