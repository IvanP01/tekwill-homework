package edu.tekwill.exercise2603.ex3.internetServiceProvider;
/* An Internet service provider has three different subscription packages
 * for its customers.
 *
 * 		Package A:	For $9.95 per month 10 hours of access access are
 * 					provided. Additional hours are $2.00 per hour.
 *
 * 		Package B:	For $13.95 per month 20 hours of access are provided.
 * 					Additional hours are $1.00 per hours.
 *
 * 		Package C:	For $19.95 per month unlimited access is provided.
 *
 * Write a program that calculates a customer's monthly bill. It should
 * ask the user to enter the letter of the package the customer has
 * purchased (A, B, or C) and the number of hours that were used. It
 * should then display the total charges.
 */

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double Package_A_Price = 9.95;
        final double Package_B_Price = 13.95;
        final double Package_C_Price = 19.95;

        final int Package_A_hour_Acces = 10;
        final int Package_B_hour_Acces = 20;

        final double Package_A_Aditional_Price_Per_Hour = 2;
        final double Package_B_Aditional_Price_Per_Hour = 1;

        int hoursExceed = 0;
        double extraCharge = 0;
        double totalBill = 0;

        int userInputHours;
        String userInputPackage;

        System.out.println("What package do you have? ");
        userInputPackage = scanner.nextLine();

        System.out.println("How many hours did you use? ");
        userInputHours = scanner.nextInt();

        if (userInputPackage.equalsIgnoreCase("a")) {
            if (userInputHours > Package_A_hour_Acces) {
                hoursExceed = userInputHours - Package_A_hour_Acces;
                extraCharge = hoursExceed * Package_A_Aditional_Price_Per_Hour;
            }
            totalBill = Package_A_Price + extraCharge;
        } else if (userInputPackage.equalsIgnoreCase("b")) {
            if (userInputHours > Package_B_hour_Acces) {
                hoursExceed = userInputHours - Package_B_hour_Acces;
                extraCharge = hoursExceed * Package_B_Aditional_Price_Per_Hour;
            }
            totalBill = Package_B_Price + extraCharge;
        } else if (userInputPackage.equalsIgnoreCase("c")) {
            totalBill = Package_C_Price;
        }
        // to do
        //  System.out.println( userInputPackage, hoursExceed, extraCharge, totalBill);


    }
}
