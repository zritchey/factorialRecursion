package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a program to implement the factorial function. Enter a negative number to exit the program.\n\n\n");
        int i=0;
        int f=0;
        while (1 == 1) {
            System.out.println("Please enter a number: ");
            i=sc.nextInt();
            if (i<0)
                break;
            f=factorial(i);
            System.out.println("The factorial of "+i+" is "+f);
            System.out.println("Or in mathematical notation, "+i+"! = "+f+"\n");
        }
    }
    public static int factorial(int i) {
        if (i > 1)
            i*=  factorial(i - 1);
        return i;
    }
}
