package tcs.Last7Days;
import java.util.*;
public class WordList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input =sc.nextLine();
        String[] words = input.split(",");
        HashSet<String>set = new HashSet<>();

        for(String word:words){
            set.add(word.trim());
        }

         ArrayList<String>list = new ArrayList<>(set);

         Collections.sort(list);

         for(String word:list){
            System.out.print(word +" ");
         }
         System.out.println();

         Collections.sort(list,Collections.reverseOrder());
         for(String word:list){
            System.out.print(word +" ");
         }

    }
}
