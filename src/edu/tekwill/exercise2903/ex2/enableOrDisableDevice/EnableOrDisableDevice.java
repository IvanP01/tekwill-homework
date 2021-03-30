package edu.tekwill.exercise2903.ex2.enableOrDisableDevice;

import java.util.Scanner;

public class EnableOrDisableDevice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Imput key which will enable or disable a device in your house (0 - 9): ");
        int code = in.nextInt();

        switch (code) {
            case 0:
                System.out.println("You've enable the lights in the bathroom");
                break;
            case 1:
                System.out.println("You've disable the lights in the bathroom");
                break;
            case 2:
                System.out.println("You've enable the lights in the livingroom");
                break;
            case 3:
                System.out.println("You've disable the lights in the livingroom");
                break;
            case 4:
                System.out.println("Turn on the stove");
                break;
            case 5:
                System.out.println("Turn off the stove");
                break;
            case 6:
                System.out.println("Start the boiler");
                break;
            case 7:
                System.out.println("Stop the boiler");
                break;
            case 8:
                System.out.println("You've enable the lights in the kitchen");
                break;
            case 9:
                System.out.println("You've disable the lights in the kitchen");
                break;
            default:
                System.out.println("Don't corespond with keys!");
        }
    }
}
