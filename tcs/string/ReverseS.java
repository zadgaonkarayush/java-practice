package tcs.string;
import java.util.Scanner;
class ReverseS{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      char[] arr = str.toCharArray();

      int i=0;
      int j =str.length()-1;
      while(i<=j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
      System.out.print(new String(arr));
      sc.close();
    }
}