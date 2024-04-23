package com.example.DSA;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0;
        //Take input from user till user does not press X or x
         while(true){
             // take the operator as input
             System.out.print("Enter the operator: ");
             char op = sc.next().trim().charAt(0);
             System.out.println();
             if(op == '+' || op == '-' || op =='*' || op == '/' || op == '%'){
                 System.out.print("Enter two numbers: ");
                 //take two numbers
                 int num1 = sc.nextInt();
                 int num2 = sc.nextInt();
                 System.out.println();

                 if(op == '+'){
                     ans = num1 + num2;
                 }
                 if(op == '-'){
                     ans = num1 - num2;
                 }
                 if(op == '*'){
                     ans = num1 * num2;
                 }
                 if(op == '/'){
                     if(num2 !=0){
                         ans = num1 / num2;
                     }
                 }
                 if(op == '%'){
                     ans = num1 % num2;
                 }
             }
             else if(op == 'x' || op =='X'){
                 break;
             }
             else {
                 System.out.println("Invalid Operation");
             }
             System.out.println("'Answer is: " + ans);
         }
    }
}
