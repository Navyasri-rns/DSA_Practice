package com.example.DSA.interviewQuestions;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDSA {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of numbers include negative number");
        int n;
        while(true){
           n = sc.nextInt();
            if(n<0){
                break;
            }
            list.add(n);
        }
        System.out.println("Value of n: " + n);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        sc.close();
    }
}
