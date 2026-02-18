package tcs;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long fact = factorial(n);
        System.out.println(fact);
        sc.close();
    }
    private static long factorial(int n){
        long fact =1;
        if(n<=1){
            return 1;
        }
        for(int i=1;i<=n;i++){
          fact = fact*i;
        }
        return fact;
    }
}
