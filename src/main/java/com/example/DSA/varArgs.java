package com.example.DSA;

import java.util.Arrays;

public class varArgs {
//Variable Arguments length is not constant i.e., varies
    public static void main(String[] args) {
         fun(2,43,4,5,1,5);
         multiple(2,3,"Navya","Navyasri");

    }

    static void fun(int...a){ //we can give any no of arguments(int...v)
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, String...c){

    }
}
