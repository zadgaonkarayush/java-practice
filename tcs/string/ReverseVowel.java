package tcs.string;
import java.util.Scanner;
public class ReverseVowel {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      char[] arr = str.toCharArray();
      int i=0;
      int j=str.length()-1;

      while(i<j){
        while(i<j && !isVowel(str.charAt(i))){
            i++;
        }
        while(i<j && !isVowel(str.charAt(j))){
            j--;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
      System.out.println(new String(arr));
    }
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);

        if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}
