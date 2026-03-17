package tcs.matrix;
import java.util.Scanner;
public class ParkingLot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int m = sc.nextInt();

        int [][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int result = maxCar(matrix);
        System.out.println(result);

    }
    public static int maxCar(int[][]matrix){
        int maxCount=0;
        int row=-1;

        for(int i=0;i<matrix.length;i++){
            int cnt=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] ==1){
                    cnt++;

                }
            }
            if(cnt>maxCount){
                maxCount=cnt;
                row = i;
            }
        }
        return row;
    }
}
