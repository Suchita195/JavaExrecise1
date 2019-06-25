package com.stackroute.pe1;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        int num, m, x, i = 0, res = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = input.nextInt();
        m = num;
        while (num > 0) {
            x = num % 10;
            i = i * 10 + x;
            num = num / 10;
        }

            if (i == m)
            {

                while(m>0) {
                    x = m % 10;
                    if (x % 2 == 0) {
                        res = res + x;
                    }
                    m = m / 10;
                }

                if (res > 25) {
                    System.out.println("It is a palindrome and sum of even nos is more than 25");
                } else {
                    System.out.println("It is a palindrome and sum of even nos is less than 25");
                }


            }
               else if(i!=m)

                System.out.println("It is not a palindrome");



    }
}
