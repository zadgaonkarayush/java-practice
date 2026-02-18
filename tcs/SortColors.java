package tcs;
import java.util.ArrayList;
import java.util.Scanner;
public class SortColors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer>Colors = new ArrayList<>();
         
        for(int i=0;i<n;i++){
            Colors.add(sc.nextInt());
        }
        sortColors(Colors);
        for(int i=0;i<Colors.size();i++){
            System.out.print(Colors.get(i) + " ");
        }
        
    }
    private static void sortColors(ArrayList<Integer>Colors){
        int low =0;
        int mid =0;
        int high = Colors.size()-1;

        while(mid<=high){
            if(Colors.get(mid) == 3){
                swap(Colors,low,mid);
                low++;
                mid++;
            }
            else if(Colors.get( mid) ==5){
                mid++;
            }else{
                swap(Colors,mid,high);
                high--;
            }
        }
    }
    private static void swap(ArrayList<Integer>Colors,int i,int j){
        int temp = Colors.get(i);
        Colors.set(i,Colors.get(j));
        Colors.set(j,temp);
    }
}
