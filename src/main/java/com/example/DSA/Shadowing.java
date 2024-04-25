package com.example.DSA;

public class Shadowing {
    static int x = 90; //This will shadowed/hide at line no 7
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; //The class variable of line 4 is shadowed by this
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
