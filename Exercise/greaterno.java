package Functions.Exercises;
import java.util.*;

public class greaterno {
    

    public static int Greater(int a, int b){
        
       if(a > b){
        return a;

       }else if(b > a){
        return b;

       }else {
        System.out.println("Both numbers are same");
        return a;
    
       }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("this is the sum of grater numbers:" + Greater(a, b));

    }
    
}


