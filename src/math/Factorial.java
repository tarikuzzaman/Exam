package math;

import java.util.Scanner;
/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static int factorial(int num) {

        if (num > 1) {
            return num * factorial(num - 1);
        }
        else
            return num;

    }
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);
        int temp,fact = 1;
        System.out.print("Please enter a positive number: ");
        int num = sc.nextInt();
        if(num<0) {
            System.out.println("Negative numbers are not allowed");
            System.exit(0);
        }

        System.out.println("The factorial calculated using recursion is: "+ factorial(num));
        for(int i = num ; i > 1 ; i--){
            fact = fact * i;
        }
        System.out.println("Factorial using iteration: "+fact);

    }
}
