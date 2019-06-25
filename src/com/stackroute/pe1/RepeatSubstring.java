package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatSubstring {

    public static void main(String[] args)

    {
        String str;
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        str = in.nextLine();
        System.out.println("Enter a number");
        n = in.nextInt();
       String torepeat= str.substring(str.length()-n);
       System.out.print(str);
       for(int i=0;i<n;i++)
       {
           System.out.print(torepeat);
       }

    }
}
