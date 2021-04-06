package edu.tekwill.exercise0204.ex2.displayFourPaterns;

public class PaternB {
    public static void main(String[] args) {
        System.out.println("Patern B");
        int rows = 6;
        for (int row = 6; row >= 1; --row) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
