package tcs;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       
         Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = a+b;
        // System.out.println(sum);
        
        // for(char ch='A';ch<='K';ch++){
        //      int value = ch - 'A' + 1;
        // System.out.println(value);
        // }
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);

            }
        }
      

    }
}
