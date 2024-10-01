
// Practice question 4: What will be the type of result in thefollowing Java code?


public class PQ4_Datatype {
    public static void main(String arg[]){
        byte b = 4;
        char c = 'c';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.print("Result of this question :" + result);

    }
    
}
