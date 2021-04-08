package edu.tekwill.exercise0504.ex2.conversionFrommilesToKilometers;

public class ConversionFromMilesToKilometer {

    public static void main(String[] args) {
        int result;
        for (int miles = 1; miles <= 10; miles++) {
            result = miles * 1609;
            System.out.println("Result of conversion: "+ miles + " miles in kilometers is: " + result);
            
        }
    }
}
