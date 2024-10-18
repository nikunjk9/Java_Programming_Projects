
/* Switch statement
1. It is not required to write the numbering of the cases in 1,2,3 but we can write in any order eg. 3,2,1
2. It is not required that the cases would be only number it can be anything eg. char, a,b,c 
*/


import java.util.*;

public class SwitchStatements {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();                                               // Taking input from user but here w

        switch(number){                                                          //  switch statement taking variable that we made
            case 1 : System.out.println("I want momos");                         //if first case is true then this will print 
                        break;                                                   /*  if we don't include break then the switch statement won't know where to stop if any case is true 
                                                                                  it will just print all the remaing cases below that true case without even checking the case so we need 
                                                                                  to add break to inform that here the code breaks  */

            case 2 : System.out.println("I want mango shakes");
                        break;   
            case 3 : System.out.println("I want paneer wrap");
                        break;  
            default : System.out.println("Tera naukar nahi hu");                  // if we input anything which is not amoung the three cases then this default case will be triggered and this will print
                        break;       
        }

        sc.close();

    }
    
}
