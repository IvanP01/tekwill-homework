package edu.tekwill.exercise2903.ex5.findWeekDayName;

import java.util.Scanner;

public class FindWeekNayName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Imput week number (1 - 7): ");
        int weekday = scanner.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thusday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Eror! 7 days are week!");
        }
    }
}
