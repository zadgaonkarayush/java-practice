package tcs.number;

import java.util.Scanner;

public class SpeedCalc {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        long d = sc.nextLong();
       long t =sc.nextLong();
       long speed =speedIs(d, t);
       System.out.println(speed);

    }
    public static long speedIs(long d,long t){
        long s = (d/t);
        s= s*18/5;
        return s;
    }
}
