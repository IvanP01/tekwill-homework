package edu.tekwill.exercise2403.ex3.readsNumberAndDysplaysTheNameOfTheWeekday;

import java.util.Scanner;

/*
* Write a Java program that reads a number from the user and displays the name of the weekday based on user's number.
Test Data
Input number: 3
Expected Output :
Wednesday
* */

public class ReadsNumberAndDysplaysTheNameOfTheWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.print("Input number: ");

        if (num == 1)
            System.out.println("Monday");
        if (num == 2)
            System.out.println("Tuesday");
        if (num == 3)
            System.out.println("Wednesday");
        if (num == 4)
            System.out.println("Thursday");
        if (num == 5)
            System.out.println("Friday");
        if (num == 6)
            System.out.println("Saturday");
        if (num == 7)
            System.out.println("Sunday");
        if (num <= 0 || num >= 8)
            System.out.println("This day desen't exist!");

    }
}
