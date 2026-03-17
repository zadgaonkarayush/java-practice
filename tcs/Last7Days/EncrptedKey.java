package tcs.Last7Days;
import java.util.*;
public class EncrptedKey {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      String E = sc.nextLine().trim();
      String[] parts = sc.nextLine().trim().split(" ");
      int n = parts.length;
      int[] A = new int[n];

      for(int i=0;i<n;i++){
        A[i] = Integer.parseInt(parts[i])%26;
      }
      int key = -1;
      for(int k=0;k<26;k++){
         boolean valid = true;
         for(int i=0;i<n;i++){
            int e = E.charAt(i) - 'A';
            if((A[i]+k)%26 !=0){
                valid=false;
                break;
            }
         }
         if(valid){
            key=k;
            break;
         }
      }
      if(key !=-1){
        System.out.println((char)('A'+key));
      }else{
         System.out.println("No Key Found");
      }
    }
}
