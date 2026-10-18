package Functions.Exercises;
import java.util.*;

public class Oddnumbers {
    

    public static int Odd(int n){
        
        int sum = 0;
        
        for(int i=1; i<=n; i++){
            if(i%2 !=0){
                sum = sum + i;
               
            }
            

        } return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println("this is the sum of odd numbers:" + Odd(n));

    }
    
}
