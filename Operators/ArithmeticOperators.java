
// Arithmetic Operator: Binary Operator

public class ArithmeticOperators{
    public static void main(String arg[]){
        int a = 10;
        int b = 15;

        //Addition Operator
        int addition = a + b;
        System.out.println("Addition of two number :" + addition);

        //If we want to write this in short then we can write
        System.out.println("Addition of two number :" + (a + b));               // same goes with other operators

        // Substraction Operator
        int substract = a - b;
        System.out.println("Sustracting two number :" + substract);

        // Mutiplying Operator
        int multiply = a*b;
        System.out.println("Multiplying two numbers :"  +  multiply);

        // Division Operator
        float division = a/b;
        System.out.println("Division of two numbers :" + division);

        //Modulo operator: provides remainder 
        int modulo = a%b;
        System.out.print("Modulo(Remainder) of two number :" + modulo);

    }

}