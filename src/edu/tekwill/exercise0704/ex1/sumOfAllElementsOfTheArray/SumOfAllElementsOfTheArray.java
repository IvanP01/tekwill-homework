package edu.tekwill.exercise0704.ex1.sumOfAllElementsOfTheArray;

public class SumOfAllElementsOfTheArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 8};
        int summ = 0;
        for (int i : array) {
            summ += i;
        }
        System.out.println("Sum of All elements stored in the Array is: " + summ);
    }
}
