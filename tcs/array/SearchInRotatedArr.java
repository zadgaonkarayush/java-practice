package tcs.array;
import java.util.Scanner;
public class SearchInRotatedArr {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int []arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }
       int target = sc.nextInt();
       int res = search(arr, target);
         System.out.print(res);

    }
    public static int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }else{
              
                if(nums[mid]<target && nums[right]>=nums[mid]){
                   left=mid+1;
                }else{
                    right=mid-1;
                }
            
            }
            
        }
        return -1;
    }
}
