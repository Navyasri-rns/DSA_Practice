package com.example.DSA;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        //Find the largest of 3 numbers
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c>max) {
            max = c;
        }
        System.out.println("Largest of 3 numbers is = " + max);

        // using math
        int maxNum = Math.max(c, Math.max(a, b));
        System.out.println(maxNum);
    }
}
