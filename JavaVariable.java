//Learning Variable in Java

public class JavaVariable{
    public static void main(String arg[]){
        int a = 10;
        int b = 20;
        System.out.println("a"); // Now if we write "a" in this then it will print a but not it's value
        System.out.println(a); //Now writing a without double quotes prints it's value
        System.out.println(b);

        String name = "Nikunj Kumar"; //Printing a name
        System.out.println(name);

        // Changing value of a variable in middle of code
        a = 100;
        System.out.println(a);

        // Assigning value of one varibale to another variable
        a = b;
        System.out.print(a);

    }
}
