package com.example.DSA;

import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 2;

        while (c*c<=num){    //{c*c<=num} represents square root, decreases Time Complexity instead of [c<num]
            if (num%c==0){
                System.out.println("Not a prime number");
                return;
            }
            c+=1;
        }
        System.out.println("Prime number");
    }
}
