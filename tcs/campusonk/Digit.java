package tcs.campusonk;
import java.util.*;
public class Digit {
    public static void main(String[] args){
       Scanner sc  = new Scanner(System.in);

       int n = sc.nextInt();
       int r = sc.nextInt();

       int sum = sumOfDigit(n);
       int num = sum*r;
       
       
       int result = digitRoot(num);
       
       System.out.println(result);
    }
    public static int sumOfDigit(int n){
        int sum=0;
         while(n!=0){
        int digit = n%10;
        sum+=digit;
        n=n/10;
       }
      return sum;
    }
    public static int digitRoot(int sum){
        while(sum>=10){
            sum=sumOfDigit(sum);
        }
        return sum;
    }
}
