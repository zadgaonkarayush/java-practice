package tcs.Last7Days;

import java.util.*;

public class bitwiseOrallSubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
 long sum=0;
        HashSet<Integer>hash = new HashSet<>();

        for(int i=0;i<n;i++){
            int or=0;

            for(int j=i;j<n;j++){
                or|=arr[j];
                sum+=or;
                hash.add(or);
            }
        }
        System.out.println(hash.size());
                System.out.println(sum);

    }
}
