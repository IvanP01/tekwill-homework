package edu.tekwill.exercise0504.ex6.simulation;

import java.util.Random;

public class Simulation {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        int varHeads = 0, varTails = 0, index = 0;
        while (index < 100000) {
            n = random.nextInt(2);
            index++;
            if (n % 2 == 0) {
                varHeads++;
            } else {
                varTails++;
            }
        }
        System.out.println("Total count of Heads is " + varHeads);
        System.out.println("Total count of Tails is " + varTails);
    }
}
