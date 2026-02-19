package tcs.string;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(Anagram(s1, s2)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }
    public static boolean Anagram(String s1,String s2){
        int[] cnt = new int[26];
        if(s1.length() !=s2.length()){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            cnt[c1-'a']++;
            cnt[c2-'a']--;
        }
        for(int c:cnt){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}
