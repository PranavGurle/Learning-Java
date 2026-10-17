package Functions;

import java.util.*;


public class Multiply{


    public static int MultiplyTwonumbers(int a, int b){
        
        return a * b;
    }




    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


            System.out.println("this is the multiplication: " + MultiplyTwonumbers(a, b));
        

    }



}
