import java.util.Scanner;

public class Hypotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double hypotenus;

        System.out.print("Enter length of A: ");
       a = scanner.nextDouble();
        System.out.print("Enter length of B: ");
        b= scanner.nextDouble();

        hypotenus = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));

        System.out.println("The hypotenues of trangle is: " + hypotenus);
        scanner.close();
    }
}
