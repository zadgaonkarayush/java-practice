package tcs.string;
import java.util.Scanner;
import java.util.ArrayList;
public class KingEncrptString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine().trim();
        char key = sc.nextLine().trim().charAt(0);    
        int KeyVal = key-'A'+1;
       

        ArrayList<Integer>arr = new ArrayList<>();

         StringBuilder result = new StringBuilder();
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            int val = ch-'A'+1;
             
            int encrypted = KeyVal+val;
           arr.add(encrypted);
        }
       for(int num:arr){
         int value = num%26;
      
        if(value==0){
            value=26;
        }

        char ch = (char)(value+'A'-1);
        result.append(ch);
       }

       System.out.print(result.toString());
    }
}
