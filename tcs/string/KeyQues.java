package tcs.string;
import java.util.Scanner;
public class KeyQues {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       String message = sc.nextLine().trim();
       char key = sc.nextLine().trim().charAt(0);

       int KeyValue = key - 'A' +1;

       StringBuilder result = new StringBuilder();

       for(int i=0;i<message.length();i++){
       char ch = message.charAt(i);

       int val = ch-'A'+1;

       int encrypted = val+KeyValue;

       result.append(encrypted);
        if(i != message.length()-1){
         result.append(" ");
        }

       }
       System.out.print(result.toString());
       sc.close();
    }
}
