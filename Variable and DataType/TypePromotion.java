/*  Type promotion:

1. Java automatically promotes each byte, short, char operands into int when evaluating an expression

*/


import java.util.*;

public class TypePromotion{
    public static void main(String arg[]){
        char ch = 'a';
        char ch1 = 'b';

        //Conversion of char into int
        int number = ch;
        int number2 = ch1;

        //another way to convert char into int 
        System.out.println((int)ch);
        System.out.println((int)ch1);       

        //Printing values of char, each char has a value assigned to it 
        System.out.println(number);
        System.out.println(number2);

        //Sum of two char
        int sum = ch+ch1;
        System.out.println(sum);

        //Subtrating two char
        int substract = ch1-ch;
        System.out.println(substract);   
        
        // There another way to directly print 
        System.out.println(ch1-ch);

        // Type promotion willonly be done on expression if we try to do it directly it won't work out
        System.out.println(ch1);                 // Will display the char itself not the value

        // Another way to understand this
        char c = a-b;          // Here we are converting from int to char which is not possible so it will show error


        //Another example of type promotion
        short a = 10;
        byte b = 12;
        char c = 'c';
        byte bt = a + b + c;               /*ERROR: conversion from int to byte is not possible, but we have not used any int datatype here 
                                            this happen cause of type promotion byte, char, and short are promoted to int in an expression
                                            */

       // But if we want to do the conversion anyway we will do typecasting
       byte bt = (byte) (a + b + c);




    }
}