package tcs;
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
     int result  = gcd(a,b);
     int Lcm = (a*b)/result;
        System.out.println("GCD: "+result);
        System.out.println("LCM: "+Lcm);
    }
    private static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
