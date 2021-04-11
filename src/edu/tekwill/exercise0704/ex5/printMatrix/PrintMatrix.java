package edu.tekwill.exercise0704.ex5.printMatrix;


import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input elements in the Matrix: ");
        int matrixsize = scanner.nextInt();

        int matrix[][] = new int[matrixsize][matrixsize];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("element - [" + row + "],[" + column + "] position: ");
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("The matrix is :");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
