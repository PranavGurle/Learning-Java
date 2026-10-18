package Functions.Exercises;


import java.util.*;

public class voteeligibility {

    public static int Agevote(int age){
        
        if(age >= 18){
            System.out.println("Eligible to vote");
            return age;
        }else{
            System.out.println("not eligible to vote");
            return age;
        }


      

    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println("you are age is : " + Agevote(age) );

    }


    


}

