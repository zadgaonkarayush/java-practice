package tcs.string;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class GroupAnagram {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     sc.nextLine();

     String[] strs = new String[n];
     for(int i=0;i<n;i++){
        strs[i] = sc.next();
     }
   // List<List<String>> result = groupAnagrams(strs);

    // for(List<String>group:result){
    //     System.out.println(group);
    // }
    System.out.print(groupAnagrams(strs));
    }
    public static List<List<String>>groupAnagrams(String[]strs){
        HashMap<String,List<String>>map = new HashMap<>();

        for(String s:strs){
           int[] arr = new int[26];

           for(char ch:s.toCharArray()){
            arr[ch-'a']++;
           }
          
            String key = Arrays.toString(arr);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
