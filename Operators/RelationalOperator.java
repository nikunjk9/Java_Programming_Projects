
/* Relational Operation
    1. ==
    2. !=
    3. >
    4. <
    5. >=
    6. <=

*/

public class RelationalOperator{
    public static void main(String arg[]){
        
        // == (Equal to)
        int a = 10;
        int b = 2; 
        System.out.println((a==b));    // Different way to print output

        // != (Not Equal to)
        int c = 10;
        int d = 100;
        System.out.println((c!=d));     // This represent that c is not equal to d which is correct so it will print 'True'

        // > (Greater than)
        int A = 100;
        int B = 90;
        System.out.println((A>B));      // As A is greater then B so it will print 'True'

        // < (Less than)
        int C = 12;
        int D = 1;
        System.out.println((C<D));       // C is greater than D so it will print 'Flase'

        // >= (Greater than and Equal to)
        int E = 1000;
        int F = 200;
        System.out.println((E>=F));       // As E is greater than F so one condition satisfies and it will print 'True'

        // <= (Less than and Equal to)
        int e = 1000;
        int f = 200;
        System.out.println((e<=f));       // As f is greater than e so one condition satisfies and it will print 'False'









    }
}