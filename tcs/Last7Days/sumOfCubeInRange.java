package tcs.Last7Days;

import java.util.Scanner;

public class sumOfCubeInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        long ans =0;

        for(int i=s;i<=e;i++){
            ans+=(long)i*i*i;

        }
        System.out.println(ans);
    }
}
