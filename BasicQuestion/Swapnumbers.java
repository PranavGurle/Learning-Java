public class Swapnumbers{

    public static void main(String args[]){

        int m = 9, n = 5;
        System.out.println("Before swappign: m = "+ m +",n = "+n);

        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping : m = " + m +", n = " + n);
        
    }
}
