package tcs.Last7Days;

import java.util.Scanner;

public class matrixDiagonal {
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
        int left = leftDiagonal(matrix, n, m);
        int right = rightDiagonal(matrix, n, m);
       
             int result = Math.abs(left - right);

        System.out.println(result);

        
       
    }
    public static int leftDiagonal(int[][]matrix,int n,int m){
        int sum=0;
        int i =0;
        int j=0;
        while(i<n && j<m){
         sum+=matrix[i++][j++];
         
        }
        return sum;
    }
    public static int rightDiagonal(int[][] matrix,int n,int m){
        
        int sum = 0;
       for(int i=0;i<n;i++){
           sum+=matrix[i][n-1-i];
       }
        return sum;
    }
}
