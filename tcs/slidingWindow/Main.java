package tcs.slidingWindow;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //     String s =sc.nextLine();
    //   if(isDecompose(s)){
    //     System.out.println("True");
    //   }else{
    //     System.out.println("False");
    //   }
    int n= sc.nextInt();
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
     pushEmptyChoclate(arr);

     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
     }
    }
    public static boolean isDecompose(String s){
           int i=0;
        boolean hasTwo = false;
 
     while( i <s.length()){
            char ch = s.charAt(i);

            int cnt=0;
            while(i<s.length() && s.charAt(i) == ch){
                cnt++;
                i++;
            }
            if(cnt%3 ==1){
                  hasTwo = false;
            }else if(cnt%3 ==2){
                if(hasTwo){
                    return false;
                }
                hasTwo= true;
            }
          
        }
        return hasTwo;
    }
    public static void pushEmptyChoclate(int[]arr){
        int left =0;
        int right = 1;
        while(right<arr.length){
            if(arr[left] !=0){
              left++;
              right = left+1;
            }else if(arr[right] ==0){
                right++;
            }else {
                 swap(arr,left,right);
               left++;
               right++;
            }
        }
    }
    public static void swap(int[] arr,int left,int right){
      

       int temp = arr[left];
       arr[left] = arr[right];
       arr[right] = temp;
    }
}
