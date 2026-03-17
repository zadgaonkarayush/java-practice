package tcs.string;

import java.util.*;

public class TotalSunday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int number = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        map.put("sun", 0);
        map.put("mon", 1);

        map.put("tue", 2);

        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);

        int start = map.get(day.substring(0,3));
        int firstSun = (7-1)%7;
        int ans =0;

        if(firstSun <number){
            ans = 1+(number - firstSun-1)/7;
        }
        System.out.println(ans);

    }
}
