package edu.tekwill.exercise0204.ex1.barCharPrintingProgram;

import java.util.Scanner;

public class BarCharPrintingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        System.out.print("Enter a number (1-30): ");
        n1 = scanner.nextInt();
        System.out.print("Enter a number (1-30): ");
        n2 = scanner.nextInt();
        System.out.print("Enter a number (1-30): ");
        n3 = scanner.nextInt();
        System.out.print("Enter a number (1-30): ");
        n4 = scanner.nextInt();
        System.out.print("Enter a number (1-30): ");
        n5 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print("*" + " ");
        }
        for (int i = 1; i <= n2; i++) {
            System.out.print("*" + " ");
        }
        for (int i = 1; i <= n3; i++) {
            System.out.print("*" + " ");
        }
        for (int i = 1; i <= n4; i++) {
            System.out.print("*" + " ");
        }
        for (int i = 1; i <= n5; i++) {
            System.out.print("*" + " ");
        }
    }
}
