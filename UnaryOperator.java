
// Unary Operator: 

public class UnaryOperator{
    public static void main(String arg[]){

        // Pre Increment: First the value will be changed then it will be used
        int a = 10;
        int b = ++a;
        System.out.println(a);          // First value changed to 11
        System.out.println(a);          // Then value used which is 11 now 

        int c = --a;
        System.out.println(a);
        System.out.println(c);


        // Post Increment: First value will be used then it will be changed
        int d = 15;
        int e = d++;
        System.out.println(d);            // Then Value will be changed to new value 
        System.out.println(e);            // First Orginal value will be used  

        int f = d--;
        System.out.println(d);
        System.out.println(f);

    }
}