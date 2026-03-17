package tcs.array;
import java.util.*;
public class GreaterThanPrioor {
    public static void main(String[] args){
    int[] arr = {7,4,8,2,9};

    int cnt=1;
    int maxi =arr[0];
    for(int i=0;i<arr.length;i++){
       if(arr[i]>maxi){
        cnt++;
        maxi=arr[i];
       }
      
    }
    System.out.println(cnt);
    }
  
}
