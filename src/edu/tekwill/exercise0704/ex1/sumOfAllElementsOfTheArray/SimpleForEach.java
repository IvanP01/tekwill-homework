package edu.tekwill.exercise0704.ex1.sumOfAllElementsOfTheArray;

public class SimpleForEach {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};

        //acest for folosim pentru a merge prin tot array si a printa la comnsola
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
        //exemplu de while
    int i = 0;
    while (i < arr.length){
        System.out.println(arr[i]);
        i++;
    }
    }
}
