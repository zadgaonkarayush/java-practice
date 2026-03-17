package tcs.Last7Days;

import java.util.Scanner;

public class shakeHand {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
       
        for(int i=0;i<t;i++){
         long n = sc.nextLong();

         long handShales = (n*(n-1))/2;
          
         System.out.println(handShales);

        }
    }
}
