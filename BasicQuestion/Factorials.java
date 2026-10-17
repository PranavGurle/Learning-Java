//package Basics;
//import java.util.*;



public class Factorials {

    static int factorial(int n)
    {
     if ( n == 0)
        return 1;

     return n * factorial(n - 1);

    }

    //main method
    public static void main(String[] args)
    {
        int num = 8;
        System.out.println("Factorial of " + num + " is" + factorial(5));
    }
    
 


}
