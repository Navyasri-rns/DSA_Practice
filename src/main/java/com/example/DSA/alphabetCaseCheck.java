package com.example.DSA;

import java.util.Scanner;

public class alphabetCaseCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char c = s.next().trim().charAt(0);
        if(c >= 'a' && c <= 'z') {
            System.out.println("Lower case");
        }
        else {
            System.out.println("Upper case");
        }
    }
}
