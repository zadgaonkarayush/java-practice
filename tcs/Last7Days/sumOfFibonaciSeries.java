package tcs.Last7Days;
import java.util.*;
public class sumOfFibonaciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a=0;
        int b=1;
        int sum =a;

        for(int i=2;i<=n;i++){
            sum+=b;
            int c = a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);

    }
}
