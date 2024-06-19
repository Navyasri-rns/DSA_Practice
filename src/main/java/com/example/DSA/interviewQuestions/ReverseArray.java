package com.example.DSA.interviewQuestions;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int N = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter numbers");
        for(int i=0; i<N; i++){
        //    arr[i] = i; // for linear value
            arr[i] = sc.nextInt();
        }

        for(int i = N-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
