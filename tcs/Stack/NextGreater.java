package tcs.Stack;
import java.util.*;

public class NextGreater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         int[] nums1 = new int[n];

         for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
         }
         

           int m = sc.nextInt();
         int[] nums2 = new int[m];

         for(int i=0;i<m;i++){
            nums2[i] = sc.nextInt();
         }

         int[] result = nextGreaterElement(nums1, nums2);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] nextGreaterElement(int[]nums1,int[]nums2){
        int [] result = new int[nums1.length];
        Stack<Integer>st = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = nums2.length-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            int neg = st.isEmpty() ?-1 : st.peek();
            map.put(nums2[i],neg);
            st.push(nums2[i]);

        }
        for(int i=0;i<nums1.length;i++){
          result[i] = map.get(nums1[i]);
        }
        // for(int i=0;i<nums1.length;i++){
        //     int key = nums1[i];
        //     int neg=-1;

        //     int j;
        //     for(j = 0;j<nums2.length;j++){
        //         if(nums2[j] == key){
        //           break;
        //         }
        //     }
        //     for(int k= j+1;k<nums2.length;k++){
        //         if(nums2[k]>key){
        //           neg = nums2[k];
        //             break;
        //         }
        //     }
        //     result[i] = neg;
        // }
        return result;
    }
}
