import java.io.*;
import java.util.*;

public class simpleinterest {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();        
        
        
      

        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
