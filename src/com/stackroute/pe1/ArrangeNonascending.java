package com.stackroute.pe1;
import java.util.Scanner;
public class ArrangeNonascending {
    public static void main(String[] args) {
        int n = 0, temp, res = 0, num, x, num_copy;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number you want : ");
        num = s.nextInt();
        num_copy = num;
        while (num > 0) {
            num = num / 10;
            n++;
        }
        int a[] = new int[n];
        int k = 0;
        num = num_copy;
        while (num > 0) {
            x = num % 10;
            num = num / 10;
            a[k] = x;
            k++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorting elements in non-ascending order");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        for(int i=0;i<n;i++)
        if (a[i] % 2 == 0) {
            res = res + a[i];

        }


        System.out.println("\nSum of even nos is " + res);
            if (res > 15)
                System.out.println("True");
            else
                System.out.println("False");

        }
    }

