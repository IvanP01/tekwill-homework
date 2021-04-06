package edu.tekwill.exercise0204.ex2.displayFourPaterns;

public class PaternC {
    public static void main(String[] args) {
        System.out.println("Patern C");

        for (int row = 1; row <= 6; ++row) {
            for (int column = 1; column <= 6 - row; ++column) {
                System.out.print("  ");
            }
            for (int column = row; column > 0; --column) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}