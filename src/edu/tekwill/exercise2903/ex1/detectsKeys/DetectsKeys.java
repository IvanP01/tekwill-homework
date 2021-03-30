package edu.tekwill.exercise2903.ex1.detectsKeys;

import java.util.Scanner;

public class DetectsKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imput key: ");
        String userKeys = scanner.nextLine();

        switch (userKeys){
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
            case "f":
            case "g":
            case "h":
            case "i":
            case "j":
                System.out.println("You pressed " + userKeys + " character");
                break;
            default:
                System.out.println("Error! Max 10 cases!");
        }
    }
}
