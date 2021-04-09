package edu.tekwill.exercise0704.ex4.ascendingOrder;

public class AscendingOrder {
    public static void main(String[] args) {
        // initializarea array
        int[] array = new int[]{2, 7, 4, 5, 9};
        int count = 0;
        ///printam elementele din array
        System.out.println("Initial array:");
        for (int i : array) {
            System.out.println(i);
        }
        // logica pentru a le afisa in ordine crescatoare
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }
        // afisam elementele din array dupa sortare
        System.out.println("Elements of array in sorted ascending order:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
