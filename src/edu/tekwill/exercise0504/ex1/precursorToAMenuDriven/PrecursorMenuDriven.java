package edu.tekwill.exercise0504.ex1.precursorToAMenuDriven;

import java.util.Scanner;

public class PrecursorMenuDriven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter one of the following choices: ");
        System.out.print("c) carnivore \t\t p) pianist \nt) tree \t\t\t\t g) game\nf\n");

        System.out.print("Please enter a c, p, t or g: ");
        String letterSelected = scanner.nextLine();
        while (!(letterSelected.equals("c") || letterSelected.equals("p") || letterSelected.equals("t") || letterSelected.equals("g"))) {
            letterSelected = scanner.nextLine();
            switch (letterSelected) {
                case "c":
                    System.out.println("A maple is a carnivore.");
                    break;
                case "p":
                    System.out.println("A maple is a pianist.");
                    break;
                case "t":
                    System.out.println("A maple is a tree.");
                    break;
                case "g":
                    System.out.println("A maple is a game.");
                    break;
                default:
                    System.out.print("Please enter a c, p, t or g: ");
            }
        }
    }
}


