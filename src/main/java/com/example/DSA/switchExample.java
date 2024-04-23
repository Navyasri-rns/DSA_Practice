package com.example.DSA;

import java.util.Scanner;

public class switchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any fruit name: ");
        String fruit = sc.next();
        
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Orange":
                System.out.println("round fruit");
                break;
            case "Apple":
                System.out.println("red fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("Enter a valid fruit name");
        }
    }
}
