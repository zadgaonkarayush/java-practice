import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {
    public static void main(String[] args){
        ArrayList<Integer>num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);

        System.out.println(num);
        // for(int i=0;i<num.size();i++){
        //     System.out.println(num.get(i));
        // }
        // for(int n:num){
        //     System.out.println(n);
        // }
        num.add(1,56);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
    }
}
