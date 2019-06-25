package com.stackroute.pe1;

import java.util.Scanner;

public class VerifyOriginal {

    public static void main(String[] args) {
        int original=60;
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number between 1-100:");
        n = in.nextInt();

        if(n<original)
            System.out.print("Number guessed is less than original number");

        else if(n>original)
            System.out.print("Number guessed is more than original number");

        else
            System.out.print("Number guessed matches the original number");
    }
}