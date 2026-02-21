package tcs.array;
import java.util.Scanner;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();

       for(int i=0;i<no;i++){
        int n = sc.nextInt();
    
        int [] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = sc.nextInt();
        }
        int target = sc.nextInt();
        int [] result = twoSum(arr,target);
      
         System.out.print(result[0]+" "+result[1]);

       } 
        sc.close();
    }
    public static int[] twoSum(int[] nums, int target){
      HashMap<Integer,Integer>map = new HashMap<>();

      for(int i=0;i<nums.length;i++){
        int comp = target - nums[i];

        if(map.containsKey(comp)){
            return new int[]{map.get(comp),i};
        }
        map.put(nums[i],i);
      }
      return new int[]{-1,-1};
    }
}
