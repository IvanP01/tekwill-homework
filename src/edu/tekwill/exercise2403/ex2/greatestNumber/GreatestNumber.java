package edu.tekwill.exercise2403.ex2.greatestNumber;

import java.util.Scanner;

/*
Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
* */

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int number1 = input.nextInt();

        System.out.print("Input the 2st number: ");
        int number2 = input.nextInt();

        System.out.print("Input the 3st number: ");
        int number3 = input.nextInt();

        if (number1 > number2)
            if (number2 > number3)
                System.out.print("The greatest: " + number1);

        if (number2 > number1)
            if (number2 > number3)
                System.out.print("The greatest: " + number2);

        if (number3 > number1)
            if (number3 > number2)
                System.out.print("The greatest: " + number3);

    }
}
