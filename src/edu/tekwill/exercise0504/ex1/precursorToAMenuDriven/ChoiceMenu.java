package edu.tekwill.exercise0504.ex1.precursorToAMenuDriven;

import java.util.Scanner;

public class ChoiceMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter one of the following choices: ");
        System.out.print("c) carnivore \t\t p) pianist \nt) tree \t\t\t\t g) game\nf\n");
        String userChoice;
        do {
            userChoice = in.nextLine();
            switch (userChoice){
                case "c":
                    System.out.println("A lion");
                    break;
                case "p":
                    System.out.println("Pianist");
                    break;
                case "t":
                    System.out.println("Tree");
                    break;
                case "g":
                    System.out.println("GTA");
                    break;
                default:
                    System.out.println("Please nter a c, ");
            }
        }while (!(userChoice.equals("c") || userChoice.equals("c") || userChoice.equals("c") || userChoice.equals("c")));


    }
}
