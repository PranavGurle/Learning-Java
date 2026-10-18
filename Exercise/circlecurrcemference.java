package Functions.Exercises;

import java.util.*;

public class circlecurrcemference {


    public static double Currecum(double r){

        double C =  2 * 3.14 * r; 

        return C; 

    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.println("the circumference of the circle is: " + Currecum(r));

    }


    


}
