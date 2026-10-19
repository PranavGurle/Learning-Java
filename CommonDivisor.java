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
