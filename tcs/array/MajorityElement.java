package tcs.array;
import java.util.Scanner;
public class MajorityElement {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int result = majorityElement(arr);
    System.out.print(result);
   } 
   public static int majorityElement(int[] nums){
    int cnt =0;
    int candidate =0;

    for(int num:nums){
        if(cnt==0){
            candidate = num;
        }
        if(candidate == num){
            cnt++;
        }else{
            cnt--;
        }
    }
    return candidate;
   }
}
