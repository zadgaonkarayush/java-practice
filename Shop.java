import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        double price;
        String item;
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter which item you want? :");
        item = scanner.nextLine();
        System.out.print("Enter the quantity of item? :");
        quantity = scanner.nextInt();
        System.out.print("Enter the price of item? :");
        price = scanner.nextDouble();
        total = price * quantity;

        System.out.println("You have bought :" + quantity + " " + item);

        System.out.print("And your total is 😊:" + total   );
        scanner.close();
    }
}