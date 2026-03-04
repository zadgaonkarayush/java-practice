package tcs.string;

import java.util.Scanner;
import java.util.LinkedHashMap;
public class frequencyOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         sc.nextLine();

        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }

        LinkedHashMap<String,Integer>result = frequency(arr);

        for(String key: result.keySet()){
           System.out.println(key +" "+result.get(key));
        }

    }
    public static LinkedHashMap<String,Integer> frequency(String[]arr){
        LinkedHashMap<String,Integer>map = new LinkedHashMap<>();
        for(String word:arr){
        map.put(word,map.getOrDefault(word,0)+1);
        }
        return map;
    } 
}
