package edu.tekwill.exercise0704.ex4.ascendingOrder;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 7, 8, 5, 1, 1};
        int temp;
        int size = unsortedArray.length;

        System.out.println(Arrays.toString(unsortedArray));
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size - i; ++j) {
                if (unsortedArray[i] > unsortedArray[j]){
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[i] = temp;
                }
            }
            System.out.println(i + 1 +" iteration: " + Arrays.toString(unsortedArray));
        }
    }
}
