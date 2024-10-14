// TypeCasting: A conversion of bigger datatype to smaller datatype that java doesn't allow but we still do it

import java.util.*;

public class TypeCasting{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float a = 25.0f;
        int b = (int)a;                  // Conversion of float into in is not possible in java But we still did it 
        System.out.println(b);

        // Another example: Here if the data is for students marks then it becomes and important data and we can't bear to lose it
        float marks = 99.999f;
        int percentage = (int) marks;
        System.out.println(percentage);


        // Type conversion of char to integere is possible: Cause each char in java is assigned a particular number by default
        char ch = 'a';                    // a: 97
        char ch1 = 'b';                   // b: 98, c: 99, d:100.......
        int number = ch; 
        int number2 = ch1;
        System.out.println(number);
        System.out.println(number2);




        sc.close();
    }

}