package tcs.Last7Days;

import java.util.Scanner;

public class InventoryWareHouse {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        swap10(arr, n);
   
      for(int i=0;i<n;i++){
         System.out.print(arr[i] +" ");
      }
    }
    public static void swap10(int[] arr,int n){
           int []temp = new int[n];
           int index=0;
           for(int i=0;i<n;i++){
            if(arr[i]%10 !=0 ){
                temp[index++] = arr[i];
            }
           }
           for(int i=0;i<n;i++){
            if(arr[i]%10 ==0 ){
                temp[index++] = arr[i];
            }
           }
           for(int i=0;i<n;i++){
            arr[i] = temp[i];
           }

             
    }
}
