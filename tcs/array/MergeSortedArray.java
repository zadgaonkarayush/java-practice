package tcs.array;
import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums1 = new int[m];

        for(int i=0;i<m;i++){
            nums1[i] =sc.nextInt();
        }
        int n = sc.nextInt();
        int[] nums2=new int[n];
        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
       int[] result= mergeSorted(nums1, m, nums2, n);
        for(int i:result){
            System.out.print(i + " ");
        }
    }
    public static int[] mergeSorted(int[]nums1,int m,int[] nums2,int n){
        int i = m-1;
        int j=n-1;
        int k =m+n -1;
        int[] result = new int[m+n];

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                result[k] = nums1[i];
                i--;
            }else{
                result[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            result[k--] = nums1[i--];
        }
        return result;
    }
}
