package Functions.Exercises;
import java.util.*;
public class countPNZuser {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

       

    int positive = 0;
    int negative = 0;
    int zero = 0;
    int choice;

      do{
        System.out.println("Enter a number: ");
         int n = sc.nextInt();

         if(n> 0){

            positive++;
         }
         else if(n < 0){
            negative++;
         }
         else {
            zero++;
         }

         System.out.println("Continue? ( 1 = Yes, 0 = No): ");
         choice = sc.nextInt();

      } while (choice ==1);
        
      System.out.println("Positive numbers: "+ positive);
      System.out.println("Negative numbers: "+ negative);
      System.out.println("Zeros numbers: "+ zero);
      sc.close();





   }



     

      

}
    
    
    
