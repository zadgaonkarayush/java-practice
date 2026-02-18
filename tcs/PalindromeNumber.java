package tcs;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextLong();
        long reversed = reversedNumber(n);

      if(n == reversed){
        System.out.println("true");
      }else{
        System.out.println("false");
      }

    }
    private static long reversedNumber(long n){
        long reversed = 0;

        while(n!=0){
            long digit = n%10;
            reversed = reversed*10+digit;
            n=n/10;
        }
        return reversed;
    }
}
