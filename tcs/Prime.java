package tcs;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isPrime = checkPrime(n);

       
        System.out.print(isPrime);

    }
    private static boolean checkPrime(long n){
         if(n<=1){
           return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
       return true;
    }
    
}
