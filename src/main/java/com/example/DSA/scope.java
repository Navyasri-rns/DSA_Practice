package com.example.DSA;

public class scope { // scope-> where we can access our variables
    public static void main(String[] args) {
        int a =10;
        int b = 10;

        //Block Scope
        {
 //           int  a = 99; // already initialised outside the block in the same method, so we cannot initialise
            a = 77; // but we can modify/change the value
            int c = 12; //Values initialised in  this block will remain in block i.e., cannot used outside the block
        }

    }

    //Function Scope
    static void n(int m){
        System.out.println(m); // we can access this m in this function only
    }
}
