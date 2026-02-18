package tcs;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long reversed = reverseNumber(n);
        System.out.println(reversed);

    }
    public static long reverseNumber(long n){
        long reversed = 0;
        while(n!=0){
            long digit = n %10;
            reversed = reversed*10+digit;
            n=n/10; 
        }
        return reversed;
    }
}
