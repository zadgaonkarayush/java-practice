package tcs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int s =0;
        int e = str.length()-1;

        // while(s<=e){
        //     if(str.charAt(s) != str.charAt(e)){
        //         System.out.println("Not a palindrome");
        //         return;
        //     }
        //     s++;
        //     e--;
        // }
        //     System.out.println("Palindrome");
        //     sc.close();
      while(s<=e){
        while(s<=e && !Character.isLetterOrDigit(str.charAt(s))){
            s++;
        }
        while(s<=e && !Character.isLetterOrDigit(str.charAt(e))){
            e--;
        }
        if(s>e) break;
        if(Character.toLowerCase(str.charAt(s)) != Character.toLowerCase(str.charAt(e))){
           System.out.println(false);
           return ;
        }
        s++;
        e--;

      }
      System.out.println(true);
      sc.close();
    }
}
