package Functions.Exercises;

import java.util.Scanner;

public class noraisedanotherno {





    public static double raised(int x, int n){

       double R = Math.pow(x, n);
       return R;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("theis is the raised number of this two x tens to n is : " + raised(x, n));

    }
    
}
