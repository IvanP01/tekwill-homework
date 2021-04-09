package edu.tekwill.exercise0704.ex2.dublicateEelmentsInAnArray;

public class DublicateEelmentsInAnArray {
    public static void main(String[] args) {
        int[] array = {5, 1, 5, 7, 1, 7 };
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)){
                    System.out.println("Dublicate Elements: " + array[j]);
                }
            }
        }
    }
}
