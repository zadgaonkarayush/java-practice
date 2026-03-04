package tcs.number;

import java.util.Scanner;

public class JumpGmae {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        boolean isJump = canReach(arr);

    
        System.out.print(isJump);
    }
    public static boolean canReach(int[] arr){
                int maxReach=0;

       for(int i=0;i<arr.length;i++){
    
        if(i>maxReach){
            return false;
        }
        maxReach = Math.max(maxReach,i+arr[i]);
       }
       return true;
    }
}
