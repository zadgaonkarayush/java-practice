package tcs.string;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (isIsomorphic(s1, s2)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false;
                }
            } else {
                mapST.put(c1, c2);
            }
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mapTS.put(c2, c1);
            }
        }
        return true;
    }
}
