package edu.tekwill.exercise0204.ex4.summation;

public class Summation {
    public static void main(String[] args) {
        double summ = 0;
        for (int i = 2; i <= 625; i++) {
            summ = summ + 1 / (Math.sqrt(i - 1) + Math.sqrt(i));
        }
        System.out.println("Sum is: " + summ);
    }
}