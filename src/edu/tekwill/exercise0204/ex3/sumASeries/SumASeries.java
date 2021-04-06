package edu.tekwill.exercise0204.ex3.sumASeries;

public class SumASeries {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i < 97; i += 2) {
            double j = i + 2;
            System.out.println(i + " / " + j);
            sum += i/j;
        }
        System.out.println("Sum is:" +sum);
    }
}
