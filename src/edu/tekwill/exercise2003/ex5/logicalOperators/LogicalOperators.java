package edu.tekwill.exercise2003.ex5.logicalOperators;

/*What's the output of this program?
int a = 18;
int b = 22;
int c = 30;
System.out.println(++a > 18 || b++ < 10);
System.out.println(b-- > 30 && a++ <= 19);
System.out.println(c++ > a && a < b || c++ < 30);
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
Which expressions will execute and which will not?
Aici la fel, încercați singuri să ajungeți la rezultat, și să scrieți în comentarii alături de fiecare System.out.println care expresie este evaluată sau nu, și de ce*/

public class LogicalOperators {

    public static void main(String[] args) {
        int a = 18;
        int b = 22;
        int c = 30;

        System.out.println(++a > 18 || b++ < 10);//avem ++a preincrement deci ++a va fi 19>18 respectiv avem true
        System.out.println(b-- > 30 && a++ < 30);//avem b-- postincrement deci b-- va fi 22>30 //false
        System.out.println(c++ > a && a < b || c++ < 30);//prima expresie ii true, a doua expresie dupa sout este truesi ambele sunt true
        //System.out.println(a < b || c++ < 30);//true
        System.out.println("a = " + a);//19
        System.out.println("b = " + b);//23
        System.out.println("c = " + c);//31

    }
}
