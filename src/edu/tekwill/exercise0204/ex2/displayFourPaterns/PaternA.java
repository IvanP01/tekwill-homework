package edu.tekwill.exercise0204.ex2.displayFourPaterns;

public class PaternA {
    public static void main(String[] args) {
        System.out.println("Patern A");
        int rows = 6;
        for (int row = 1; row <= rows; ++row) {
            for (int column = 1; column <= row; ++column) {
                System.out.print(column + " ");
            }
            System.out.println("");
        }
    }
}
