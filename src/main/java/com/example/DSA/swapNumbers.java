package com.example.DSA;

import java.util.Arrays;

public class swapNumbers {

    public static void main(String[] args) {

//        int a = 10;
//        int b= 20;
//
//        //swap two numbers with only one variable
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a +" "+ b);


//        //Interal working of swap program using functions
//        String name = "Navya";
//        changeName(name);
//        System.out.println(name);
//    }
//    //pass by value(copying value only not reference)
//    static void changeName(String naam) {
//        naam = "Navyasri"; //creating new object instead of changing, so value of it will not change
//        System.out.println("naam" + naam); // naam is only available and accessible here (scoping)

        //change value using pass by value only
        int[] ar = {1,2,34,6,8};
        System.out.println("Orginal array: " + Arrays.toString(ar)); //here we use toString() because if we not use toString her it will print hashcode.. why because Arrays are objects.
        change(ar);
        System.out.println("Modified array: " + Arrays.toString(ar));
    }
    static void change(int[] nums){
        nums[0] = 99; // value will changes because we are modifying the existing one.. not creating new one as above
    }
}
