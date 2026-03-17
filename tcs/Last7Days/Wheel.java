package tcs.Last7Days;

import java.util.*;

public class Wheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int w = sc.nextInt();

        if (w % 2 != 0 || w < 2 * v || w > 4 * v) {
            System.out.println(-1);
            return;
        }
        int fourWheeler = (w- 2 * v) / 2;
        int twoWheeler = v - fourWheeler;

        System.out.println(twoWheeler+" "+fourWheeler);


    }
}
