package com.stackroute.pe1;

import java.util.Scanner;


public class CheckVowelConsonant {

    public static void main(String [] args)
    {
        String ch;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");
        ch = scan.nextLine();
        int len=ch.length();
        char [] arr= ch.toCharArray();
        for(i=0;i<len;i++)

            if (arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' ||
                    arr[i] == 'i' || arr[i] == 'I' || arr[i] == 'o' || arr[i] == 'O' ||
                    arr[i] == 'u' || arr[i] == 'U')

        {
            System.out.print("vowel");
        }
        else
        {
            System.out.print("consonant");
        }
    }
}
