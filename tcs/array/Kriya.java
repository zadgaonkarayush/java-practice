package tcs.array;

import java.util.Scanner;

public class Kriya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i%2 ==0){
                sum+=i;
            }
        }
        int kriya = sum*m;
        System.out.print(kriya);

    }
}
