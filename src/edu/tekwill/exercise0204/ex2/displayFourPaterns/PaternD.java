package edu.tekwill.exercise0204.ex2.displayFourPaterns;

public class PaternD {
    public static void main(String[] args) {
        System.out.println("Patern D");

        for (int row = 0; row < 6; ++row) {
            for (int spaces = row; spaces > 0; spaces--) {
                System.out.print("  ");
            }
            for (int column = 1; column <= 6 - row; ++column) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
