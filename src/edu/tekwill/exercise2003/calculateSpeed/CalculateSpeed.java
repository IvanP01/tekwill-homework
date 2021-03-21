package edu.tekwill.exercise2003.calculateSpeed;

import java.util.Scanner;

/*Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804*/

public class CalculateSpeed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float timeSeconds;
        float mps, kph, mph;

        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Input hour: ");
        float hour = scanner.nextFloat();

        System.out.print("Input minutes: ");
        float minutes = scanner.nextFloat();

        System.out.print("Input seconds: ");
        float seconds = scanner.nextFloat();

        timeSeconds = (hour * 3600) + (minutes * 60) + seconds;
        mps = distance / timeSeconds;
        kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);
        System.out.println("Your speed in miles/h is " + mph);

    }
}
