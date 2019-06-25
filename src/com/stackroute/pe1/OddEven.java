package com.stackroute.pe1;

import java.util.Scanner;

public class OddEven {


    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = in.nextInt();
        if (num % 2 == 1) {
            if (num > 20 && num < 30) {
                System.out.println("Tom");
            }
        } else if (num % 2 == 0) {
            if (num > 20 && num < 30) {
                System.out.println("Jerry");
            }

        }
    }
}
