package tcs.Last7Days;

import java.util.*;

public class CrypticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (cryptic(i)) {
                arr.add(i);
            }
        }

        int[] result = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        if (arr.size() == 0) {
            System.out.println("Invalid Range");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");

            }
        }

    }

    public static boolean cryptic(int n) {
        if ((n % 7 == 0) && (n % 5 != 0) && !palindrome(n) && hasUnique(n)) {
            return true;
        }

        return false;

    }

    public static boolean palindrome(int n) {
        int temp = n;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        if (n == reverse) {
            return true;
        }
        return false;
    }

    public static boolean hasUnique(int n) {
        n = Math.abs(n);
        HashSet<Integer> hash = new HashSet<>();

        while (n > 0) {
            int digit = (int) (n % 10);

            if (hash.contains(digit)) {
                return false;
            }
            hash.add(digit);
            n = n / 10;
        }
        return true;
    }
}