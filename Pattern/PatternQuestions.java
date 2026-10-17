import java.util.*;


public class Patternquetions {
    


    public static void main(String args[]){
           
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();



        for(int i = 1; i <= n; i++ ){

            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     

    }
}















//import java.util.*;


public class Patternquetions {
    

     public static void main(String args[]){


        int n = 4;
        int m = 5;
        //outer loop
        for(int i=1; i<=n; i++){

            for(int j=1; j<=m; j++) {
                //cell ->(i,j)
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();



        }


     }

              
        
        
    }













//import java.util.*;


public class Patternquetions {
    

     public static void main(String args[]){


        int n = 4;
        int m = 5;
        //outer loop
        for(int i=n ; i>=1; i--){
              //innerloop
            for(int j=1; j<=i; j++) {
                System.out.print("*");
              
            }
            System.out.println();



        }


     }

              
        
        
    }















//import java.util.*;


public class Patternquetions {
    

     public static void main(String args[]){


        int n = 4;
        for(int i = 1; i<=n; i++ ){
            //inner loop ->space print
          for(int j=1; j<=n-i; j++){
                  System.out.print(" ");
             }
              //inner loop -> star print
              for(int j=1; j<=i; j++){
                System.out.print("*"); 
              }
              System.out.println();
            
            
            }





       



        


     }

              
        
        
    }

        
      
