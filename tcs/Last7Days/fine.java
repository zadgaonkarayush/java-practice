package tcs.Last7Days;

import java.util.Scanner;

public class fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int fine = sc.nextInt();

        int total = 0;

        for (int i = 0; i < n; i++) {
            if (!isOdd(d)) {
                if (isOdd(arr[i])) {
                    total += fine;
                }
            } else {
                if (isOdd(arr[i])) {
                    total += fine;
                }
            }
        }
        System.out.println(total);

    }


    public static boolean isOdd(int d){
        if(d%2 !=0){
            return true;
        }
        return false;
    }
}
