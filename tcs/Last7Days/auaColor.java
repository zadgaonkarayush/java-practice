package tcs.Last7Days;
import java.util.*;
public class auaColor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int l = sc.nextInt();


      
        int max=0;
        int cnt=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i) == 'a'){
                cnt++;
            }
        }
        max =cnt;

        for(int j=l;j<s.length();j++){
            if(s.charAt(j) =='a')cnt++;
              if(s.charAt(j-l) =='a')cnt--;

            max = Math.max(cnt,max);
        }
        System.out.println(max);
    }
}
