package edu.tekwill.exercise0704.ex2.dublicateEelmentsInAnArray;

public class Dubltwo {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j))
                    System.out.println("Dublate elem: " + arr[j]);
            }
        }
    }
}
