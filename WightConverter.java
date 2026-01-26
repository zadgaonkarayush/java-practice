import java.util.Scanner;

public class WightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.print("1. Convert kg to lbs \n 2. Convert lbs to kg \n Select (1 or 2) : ");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.print("Enter yout weight in Kg: ");
            double weight = scanner.nextDouble();

            double lbsWeight = weight * 2.205;
            System.out.printf("Your weight in Lbs is %.2f  " , lbsWeight);

        } else if (option == 2) {
            System.out.print("Enter yout weight in lbs: ");
            double weight = scanner.nextDouble();

            double lbsWeight = weight / 2.205;
            System.out.printf("Your weight in Lbs is %.2f  " , lbsWeight);
        } else {

            System.out.print("That was not valid choice!");
        }
        scanner.close();
    }
}
