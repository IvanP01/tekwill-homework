package edu.tekwill.exercise2003.ex7.declareDatatype;

public class DeclareDatatype {

    public static void main(String[] args) {

        int intValue = 50;
        double doubleValue = 30.2;

        double sumOfIntAndDouble;
        sumOfIntAndDouble = intValue + doubleValue;
        //Dat fiind faptul ca rezultatul va fi de tip double, Idea automat ne-a sugerat ca sumOfIntAndDouble va fi de tip Double.
        //chiar daca am incercat sa declar de tip int.
        System.out.println(sumOfIntAndDouble);
    }
}
