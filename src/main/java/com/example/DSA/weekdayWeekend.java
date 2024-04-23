package com.example.DSA;

import java.util.Scanner;

public class weekdayWeekend {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number b/w 1-7: ");
        int i = s.nextInt();

        switch (i){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Enter any number b/w 1-7 only");
        }
    }
}
