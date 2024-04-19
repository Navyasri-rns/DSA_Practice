package com.example.DSA;

import java.util.Scanner;

public class fibonacciNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = s.nextInt();

        int a = 0;
        int b = 1;
 //       int count = 2;
//
//        while(count <= n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        // getting the nth fibonacci number what we are giving as output number
//        System.out.println(b);

        for(int count =2; count<=n; count++){
            int temp = b;
            b = b+a;
            a = temp;
        }
        System.out.println(b);

    }
}
