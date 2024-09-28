/*  Type promotion:

2. If one operand is long, float or double the whole expression is promoted to long, float or double resp.

*/


public class TypePromotion_2 {
    public static void main(String arg[]){
        int a = 10;
        float b = 10.2f;
        long c = 30l;
        double d = 40.2d;
        double ans = a + b + c + d;
        System.out.print(ans);               // this will print a double value cause of type promotion, all the datatype got converted into double

        
        // 
        byte b = 5;
        byte a = b*2;
        System.out.print(b);             // Error: conversion from int to byte is not possible
        // As soon as we added a multiplication (*) symbol then this becomes an expression and in expression byte datatype get converted into int by type promotion


        // To fix this we can use type casting
        byte a = (byte) (b*2);
        System.out.print(a);  



    }
    
}
