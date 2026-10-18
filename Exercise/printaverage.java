package Functions.Exercises;
import java.util.*;
public class printaverage {


    public static int Average(int a, int b, int c){
        return a+b+c/2;
    }


    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();

    System.out.println("the average of these three numbers of a.b.c is: " + Average(a, b, c));
    }
    
}
