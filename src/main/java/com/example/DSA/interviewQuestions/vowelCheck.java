package com.example.DSA.interviewQuestions;

import java.util.Scanner;

public class vowelCheck {

    public static void main(String[] args) {

     //   String s = "Hello World";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String s = sc.next();

        System.out.print("Vowels: ");
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.print(ch + " ");
                    break;
            }
        }
    }
}
