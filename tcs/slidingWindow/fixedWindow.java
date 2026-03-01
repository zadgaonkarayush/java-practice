package tcs.slidingWindow;
import java.util.Scanner;
public class fixedWindow {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int n= sc.nextInt();

      int[] arr = new int[n];
      for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
      }
      sc.nextLine();

      int k= sc.nextInt();
    
      int result = maxArraySum(arr,k );

      System.out.println(result);

    }
    public static int maxArraySum(int[]arr,int k){
        int n = arr.length;

         if(n<k) return -1;
      int windowSum=0;

      for(int i=0;i<k;i++){
        windowSum+=arr[i];
      }

      int maxSum = windowSum;

      for(int i=k;i<n;i++){
        windowSum +=arr[i];
        windowSum -=arr[i-k];

        maxSum = Math.max(maxSum,windowSum);
      }
      return maxSum;
    }

}
