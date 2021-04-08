package edu.tekwill.exercise0504.ex3.highestScore;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int scoreTemp = 0, scoreMax = 0;
        String name ="", finalName ="";

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter the name of student=" + i );
            name = sc.next();
            System.out.println("Enter the score of student=" + i);
            scoreTemp = sc.nextInt();
            if (scoreTemp > scoreMax){
                finalName = name;
                scoreMax = scoreTemp;
            }
        }
        System.out.println("The name of the student with the maxim score " + scoreMax + " is " + finalName);
    }
}
