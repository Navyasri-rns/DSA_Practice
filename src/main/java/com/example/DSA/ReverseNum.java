package com.example.DSA;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any number");
        int s = sc.nextInt();

        int ans = 0;

        while(s > 0){
            int rem = s % 10;
            s = s/10;  // s /= 10;

            ans = ans * 10 + rem;
        }
        System.out.printf("reverse of given number is: "+ ans);
    }
}
