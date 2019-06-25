package com.stackroute.pe1;

import java.util.Scanner;

public class NumberSeries {


    public static void main(String[] args) {
        int num;
        int i,j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = in.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }

        }
    }
}
