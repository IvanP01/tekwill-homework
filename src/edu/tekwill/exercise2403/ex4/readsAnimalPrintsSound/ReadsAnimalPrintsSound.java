package edu.tekwill.exercise2403.ex4.readsAnimalPrintsSound;

import java.util.Locale;
import java.util.Scanner;

/*
* Write a Java program that reads an animal from the user and prints the sound it makes.
Test data
Input animal: Wolf
Expected Output :
Howl
Input animal: Sheep
Expected Output :
Baaaa
* */

public class ReadsAnimalPrintsSound {
    public static void main(String[] args) {
        System.out.print("Input animal: ");

        Scanner scanner = new Scanner(System.in);
        String soundmakes = scanner.nextLine();

        if (soundmakes.contains("Wolf"))
            System.out.println("How-How!");
        else if (soundmakes.contains("Sheep"))
            System.out.println("Baaaa!");
        else if (soundmakes.contains("Horse"))
            System.out.println("Haaaa!");
        else if (soundmakes.contains("Duks"))
            System.out.println("Mac-Mac!");
        else if (soundmakes.contains("Bear"))
            System.out.println("Mor-Mor!");
        else if (soundmakes.contains("Dog"))
            System.out.println("Ham-Ham");
        else if (soundmakes.contains("Cat"))
            System.out.println("Miau-Miau!");
        else
            System.out.println("Ops! Bye-Bye!");

    }
}
