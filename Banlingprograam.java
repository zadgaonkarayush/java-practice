import java.util.Scanner;

public class Banlingprograam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Show Balance ?");
            System.out.println("2. Deposit ?");
            System.out.println("3. Withdrawbn ?");
            System.out.println("4. Exit ?");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println(amount);
                case 2 -> {
                    System.out.print("Enter Amount: ");
                    double newAmt = scanner.nextDouble();
                    amount = depositAmt(amount, newAmt);
                }
                case 3 -> {
                    System.out.print("Enter Amount: ");
                    double newAmt = scanner.nextDouble();
                     amount = withDrawnAmt(amount, newAmt);
                }
                case 4 -> isRunning = false;
                default -> {
                    System.out.print("Invalid choice");
                }
            }
            scanner.close();
        }

    }

    static void showBalance(double balance) {
        System.out.println("************");
        System.out.println(balance);
    }

    static double depositAmt(double amount, double newAmt) {

        System.out.println("************");
        System.out.println(amount += newAmt);
        return amount;
    }

    static double withDrawnAmt(double amount, double newAmt) {

        System.out.println("************");
        if (newAmt <= amount) {
            amount -= newAmt;
            System.out.printf("Balance is %.2f ", amount);

        } else {
            System.out.println("Insufficient balance");
        }
        return amount;
    }
}
