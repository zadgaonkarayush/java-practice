package tcs.string;

import java.util.Scanner;

public class FirstPalinfrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s= sc.nextLine();
          System.out.println(longestString(s));
       

    }
    public static String longestString(String s){
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        for(int i=0;i<s.length();i++){
             int len1 = expand(s,i,i); // odd
             int len2 = expand(s,i,i+1); //even

             int lem = Math.max(len1,len2);

             if(lem >end-start){
                start = i-(lem-1)/2;
                end = i+lem/2;
             }

        }
        return s.substring(start,end+1);

    }
    public static int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
          left--;
          right++;
        }
        return right-left-1;
    }
}
