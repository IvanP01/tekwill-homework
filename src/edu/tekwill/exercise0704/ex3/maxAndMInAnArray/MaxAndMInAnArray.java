package edu.tekwill.exercise0704.ex3.maxAndMInAnArray;

public class MaxAndMInAnArray {
    public static void main(String[] args) {
        int[] array = new int[]{45, 25, 21};

        // Apelam metoda getMax pentru a primi valoarea maxima din Array
        int max = getMax(array);
        System.out.println("Maximum value is: " + max);

        //Apelam metoda getMin pentru a primi valoarea minima din Array
        int min = getMin(array);
        System.out.println("Minimum value is: " + min);
    }
    //metoda pentru a primi valoarea maxima
    private static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    //metoda pentru a primi valoarea minima
    private static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
