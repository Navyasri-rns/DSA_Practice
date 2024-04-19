package com.example.DSA;

public class automaticTypePromotoion {
    public static void main(String[] args) {

        //Type casting
        //Narrow Type casting
        int num = (int)(23.67f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        //byte max size is 256
        byte b = (byte)(a);  // 257 % 256 = 1(remainder)
        System.out.println(b);


        byte b1 = 50;
        byte b2 = 40;
        byte b3 = 100;
        int i = b1 * b2 / b3; // automatically converting byte to int
        System.out.println(i);


        int a1 = 'A';
        System.out.println(a1); // automatically converting char to int

        //example for above concepts
        byte by = 42;
        char c = 'a';
        short s = 1007;
        int i1 = 4000;
        float f = 4.74f;
        double d = 6373.4524;
        double result = (f * by) + (i1 / c) - (d - s); // float>byte  int>char  double>short
        // float + integer - double = double ( here double is greater than all)
        System.out.println((f * by) + " "+ (i1 / c) + " " + (d - s));
        System.out.println(result);
    }
}
