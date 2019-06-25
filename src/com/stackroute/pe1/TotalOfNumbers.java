package com.stackroute.pe1;

import java.util.Scanner;

public class TotalOfNumbers {

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter the numbers");
            int number, total = 0;
            while ((number = in.nextInt()) != 0) {
                total += number;
            }
            System.out.println("The total is " + total);

        }
        catch (Exception e) {
            System.out.println("Not an integer input");
        }

    }
        }
