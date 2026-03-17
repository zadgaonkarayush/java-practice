package tcs.Last7Days;
import java.util.*;
public class longestPalindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n= s.length();
        int maxlen = 0;
        int start =0;

        for(int i=0;i<n;i++){
            int left =i;
            int right =i;

            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                if(right-left+1>maxlen){
                    start = left;
                    maxlen = right-left+1;

                }
                left--;
                right++;
            }
            left=i;
            right=i+1;

            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                if(right-left+1>maxlen){
                    start = left;
                    maxlen = right-left+1;
                }
                left--;
                right++;
            }
        }
        System.out.println(s.substring(start,start+maxlen));
    }
}
