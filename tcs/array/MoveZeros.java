package tcs.array;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
}
