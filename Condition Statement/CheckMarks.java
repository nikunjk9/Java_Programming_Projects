
// Check if a student will pass or fail

import java.util.*;

public class CheckMarks {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            int marks = sc.nextInt();                                  // Taking user marks as input

            String result = (marks >= 33) ? "Pass" : "Fail";           // If marks is greater than equal to 33 then print Pass if not print fail
            System.out.println("Your result is:" + " " + result);     
         
        sc.close();

    
    }
    
}
