package edu.tekwill.exercise2603.ex1.fatGramCalculator;


import java.util.Scanner;

/*
* Fat Gram Calculator
Write a program that asks the user to enter the number of calories and fat grams in a food item.
The program should display the percentage of the calories that come from fat. One gram of fat has 9 calories; therefore:

Calories from fat  = fat grams * 9

the percentage of calorie from fat can be calculated  as follows:

calories from fact / Total calories

If the calories from fat are less than 30 percent of the total calories of the food, it should also display a message
indicating the food is low a fat.*/
public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOfCalories, fatGrams, caloriesFromFat, percentageOfCalorieFromFat;

        System.out.print("Enter the number of calories: ");
        numOfCalories = scanner.nextInt();

        System.out.print("Enter a fat grams: ");
        fatGrams = scanner.nextInt();

        caloriesFromFat = fatGrams * 9;
        percentageOfCalorieFromFat = caloriesFromFat / numOfCalories;

        if (caloriesFromFat > numOfCalories) {
            System.out.println("The input is invalid");
        } else {
            if (caloriesFromFat < (30 / 100) * numOfCalories) {
                System.out.println("The food is low a fat");
            }
            System.out.println("The percentage of calories that come from fat is " + percentageOfCalorieFromFat + "%");
        }

    }

}
