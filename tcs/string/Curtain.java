package tcs.string;
import java.util.*;

public class Curtain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int L = sc.nextInt();

        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<s.length();i+=L){
           int cnt=0;

           for(int j=i;j<i+L && j<s.length();j++){
            if(s.charAt(j) == 'a')cnt++;
           }
           maxi = Math.max(cnt,maxi);
        }
       System.out.println(maxi);
    }
}
