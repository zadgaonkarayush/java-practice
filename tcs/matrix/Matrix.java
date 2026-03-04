package tcs.matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
      int cnt=0;
     
      
      for(int i=0;i<n;i++){
         int sum =0;
        for(int j=0;j<m;j++){
            sum+=matrix[i][j];

        }
        double avg = (double) sum/matrix[i].length;

        if(avg>50){
            cnt++;
        }
      }
      System.out.println(cnt);
        sc.close();

    }

}
