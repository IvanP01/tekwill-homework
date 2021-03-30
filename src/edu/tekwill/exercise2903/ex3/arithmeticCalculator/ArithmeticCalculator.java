package edu.tekwill.exercise2903.ex3.arithmeticCalculator;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, / ): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Imput first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Imput second number: ");
        int num2 = scanner.nextInt();

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Eror! This operator not exist!");
        }
    }
}
