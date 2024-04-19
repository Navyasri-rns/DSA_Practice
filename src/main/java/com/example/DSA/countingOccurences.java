package com.example.DSA;

public class countingOccurences {

    public static void main(String[] args) {

        int num = 6576856;

        int count = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem == 6){
                count++;
            }
            num = num/10; // num /=10
        }
        System.out.println("count of 6 is: " + count);
    }
}
