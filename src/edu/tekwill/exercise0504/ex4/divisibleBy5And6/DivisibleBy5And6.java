package edu.tekwill.exercise0504.ex4.divisibleBy5And6;


public class DivisibleBy5And6 {
    public static void main(String[] args) {
        int counter = 0;  // numarator de numere div 5 si 6
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                counter++;
                System.out.print(i + "  ");
                // ten per line   cite 10 pe linie ???
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}


