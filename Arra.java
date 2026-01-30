import java.util.Scanner;
public class Arra {
    public static void main(String[]  args){
   Scanner scanner = new Scanner(System.in);
      int num =0;
   System.out.print("Enter number orders ? : ");
      num = scanner.nextInt();
                                       
       String[] foods = new String[num];

       for(int i=0;i<foods.length;i++){
        System.out.print("Enter food item? :");
        foods[i] = scanner.nextLine(); 
       }

       for(String food:foods){
          System.out.println(food);
       }

       scanner.close();
    }
   
}
