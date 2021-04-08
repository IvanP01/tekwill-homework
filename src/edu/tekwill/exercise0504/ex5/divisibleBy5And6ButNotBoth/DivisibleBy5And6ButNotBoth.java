package edu.tekwill.exercise0504.ex5.divisibleBy5And6ButNotBoth;

public class DivisibleBy5And6ButNotBoth {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; i <= 200; i++) {
            counter++;
            if (i % 5 == 0 && (i % 6 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}