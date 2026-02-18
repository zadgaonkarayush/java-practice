package tcs;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
          int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            int largest = findLargest(n1,n2,n3);
            System.out.println(largest);
             sc.close();

    }
    private static int findLargest(int n1,int n2,int n3){
        int largest =0;

        if(n1>=n2 && n1>=n3){
            largest = n1;
        }else if(n2>=n1 && n2>=n3){
            largest = n2;
        }else{
            largest = n3;
        }
      return largest;
    }
}
