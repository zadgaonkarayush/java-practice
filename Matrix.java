import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int rows;
       int cols;
       char symbol;

       System.out.print("Enter rows: ");
       rows = scanner.nextInt();
       System.out.print("Enter columns: ");
       cols = scanner.nextInt();

       System.out.print("Enter Symbol: ");
       symbol = scanner.next().charAt(0);

       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(symbol);
        }
        System.out.println();
       }
    }
}
