package tcs;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = Sum(n);

        System.out.println(sum);

    }
    private static long Sum(long n){
          long sum =0;
          while(n!=0){
            long digit =n%10;
            sum =sum+digit;
            n=n/10;
          }
          return sum;
    }
}
