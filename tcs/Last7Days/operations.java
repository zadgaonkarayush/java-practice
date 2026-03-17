package tcs.Last7Days;
import java.util.*;
public class operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = mostOnesRow(matrix);
        System.out.println(result);
    }
    public static int mostOnesRow(int[][] matrix){
        int row=0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            int cnt=0;
         for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j] ==1){
                cnt++;
            }
             if(cnt>max){
                row =i;
                  max =cnt;
            }
         }
        }
        return row;
    }
}
