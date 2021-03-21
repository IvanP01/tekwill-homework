package edu.tekwill.exercise2003.ex4.unaryIncrementAndDecrement;

public class IncrementAndDecrement {

    public static void main(String[] args) {

         int a = 7;

                      //8   //7   //7   //9   //9    //7  //7    //9
         int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;

        System.out.println(a);// result is 9
    }

}
