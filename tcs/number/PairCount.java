package tcs.number;
import java.util.Scanner;
import java.util.HashSet;

public class PairCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        int k = sc.nextInt();

    int result = pairCount(arr, k);
    System.out.print(result);

    }
    public static int pairCount(int[]arr,int k){
        int count=0;
        HashSet<Integer>set = new HashSet<>();

        for(int num:arr){
            if(set.contains(num-k)){
                count++;
            }
            if(set.contains(num+k)){
                count++;
            }
            set.add(num);
            System.out.println(set);
        }
       

        return count;
    }
}
