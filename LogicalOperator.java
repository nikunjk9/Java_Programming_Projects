// Logical Operator


public class LogicalOperator {
    public static void main(String arg[]){

        // Logical AND: If both statement are true only then final answer would be true other than that final answer would be false.
        System.out.println((3>1) && (2>100));        // One statement is false so output: False
        System.out.println((3>1) && (20>10));        // Both statement true so output: True


        // Logical OR: If both statement are False only then final answer would be false other than that final answer would be true.
        System.out.println((2>4) || (4>22));         // One statement is True so output: True
        System.out.println((20>40) || (4>12));       // Both statement is false so output: False


        // Logical NOT: If a statement is False then final answer would be true and If a statement is true then final answer would be false.
        System.out.println(!(2>3));                  // Statement is false but output would be true
        System.out.println(!(10>1));                 // Statement is true but output would be False

    }
    
}
