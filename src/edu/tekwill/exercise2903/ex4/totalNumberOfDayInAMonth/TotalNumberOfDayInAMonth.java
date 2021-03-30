package edu.tekwill.exercise2903.ex4.totalNumberOfDayInAMonth;

import java.util.Scanner;

public class TotalNumberOfDayInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input month number: ");
        int monthnumber = scanner.nextInt();

        switch (monthnumber) {
            case 1:
                System.out.println("Total number of days = 31");
                break;
            case 2:
                System.out.println("Total number of days = 28");
                break;
            case 3:
                System.out.println("Total number of days = 31");
                break;
            case 4:
                System.out.println("Total number of days = 30");
                break;
            case 5:
                System.out.println("Total number of days = 31");
                break;
            case 6:
                System.out.println("Total number of days = 30");
                break;
            case 7:
                System.out.println("Total number of days = 31");
                break;
            case 8:
                System.out.println("Total number of days = 31");
                break;
            case 9:
                System.out.println("Total number of days = 30");
                break;
            case 10:
                System.out.println("Total number of days = 31");
                break;
            case 11:
                System.out.println("Total number of days = 30");
                break;
            case 12:
                System.out.println("Total number of days = 31");
                break;
            default:
                System.out.println("Month number not exist!");
        }
    }
}
