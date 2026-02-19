package tcs.string;
import java.util.Scanner;
import java.util.HashMap;
public class UniqueChar {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
         int index = firstUniqueChar(str);
         System.out.println(index);

    }
    public static int firstUniqueChar(String s){
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}
