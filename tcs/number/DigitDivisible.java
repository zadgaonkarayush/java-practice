package tcs.number;

import java.util.Scanner;

public class DigitDivisible {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
        int sum=0;
       while(n!=0){
        int digit=n%10;
         System.out.println(digit);
        n=n/10;
          System.out.println(n);
        sum+=digit;
          System.out.println(sum);
       }
       if(sum%3 == 0){
        System.out.println("YES");
       }else{
         System.out.println("NO");
       }
    }
}
