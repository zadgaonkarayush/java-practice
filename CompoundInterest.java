import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double r;
        double p;
        int t;
        double a;
        double n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        p = scanner.nextDouble();
        System.out.print("Enter Interest Rate: ");
        r = scanner.nextDouble();
        System.out.print("Enter tenure: ");
        t = scanner.nextInt();
        System.out.print("Enter times compounded yearly: ");
        n = scanner.nextDouble();

        a =p* Math.pow(((1 + r / 100*n)), (n * t));

        System.out.printf("The amount after %d years is %.2f " ,t, a);
        scanner.close();

    }
}
