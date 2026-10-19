package Functions.Exercises;

import java.util.Scanner;

public class CommonDivisor {



    public static int Div(int n, int m){
        int sum = 1;
        for(int i = 1; i <=n && i <=m; i++){
        
           if( n % i == 0 && m % i ==0){
            
            sum = i;
        

         
        }
       }return sum;
      }


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("this is the GCD of you no. : " + Div(n, m));

    }



    
}













import java.util.*;

public class Solutions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n1 != n2) { 
            if (n1 > n2) {
                n1 = n1 - n2; // Subtract smaller from larger
            } else {
                n2 = n2 - n1;
            }
        }
        
        System.out.println("GCD is : " + n2);
    }   
}






//EFFICIENT METHOD


public static int gcd(int n1, int n2) {
    while (n2 != 0) {
        int temp = n2;
        n2 = n1 % n2;
        n1 = temp;
    }
    return n1;
}











