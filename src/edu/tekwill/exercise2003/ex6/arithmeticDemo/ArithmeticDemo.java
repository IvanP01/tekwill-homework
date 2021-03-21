package edu.tekwill.exercise2003.ex6.arithmeticDemo;

/*Re-write the following example, with shorter operators. Before running the program, in the comments, try to write the value. Then verify at the end if you've followed correctly all the calculations.*/

public class ArithmeticDemo {

    public static void main(String[] args) {

        int result = 1 + 2;//result is 3
        System.out.println(result);

        //result = result - 1;//result is 2
        result -= 1;
        System.out.println(result);

        //result = result * 2;//result is 4
        result *= 2;
        System.out.println(result);

        //result = result / 2;//result is 2
        result /= 2;
        System.out.println(result);

        //result = result + 8;//result is 10
        result += 8;
        //result = result % 7;//result is 3
        result %= 7;
        System.out.println(result);


     }
}
