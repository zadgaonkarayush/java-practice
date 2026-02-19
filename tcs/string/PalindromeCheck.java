package tcs.string;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
    public static boolean isPalindrome(String str){
          int s=0;
          int e=str.length()-1;

          while(s<=e){
            while(s<e && !Character.isLetterOrDigit(str.charAt(s))){
                s++;
            }
            while(s<e && !Character.isLetterOrDigit(str.charAt(e))){
                e--;
            }
            if(Character.toLowerCase(str.charAt(s)) !=Character.toLowerCase(str.charAt(e))){
                return false;
            }
            s++;
            e--;
          }
          return true;
    }
}
