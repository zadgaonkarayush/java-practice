import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        String op;

        System.out.print("Enter first number: ");
        a = scanner.nextDouble();

        System.out.print("Enter operator (*,+-,/,^): ");

        op = scanner.next();
        System.out.print("Enter second number: ");
        b = scanner.nextDouble();
        double result = switch (op) {
            case "*" -> a * b;
            case "+" -> a + b;
            case "-" -> a - b;

            case "/" -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    yield 0;
                }
                yield a / b;
            }
            case "^" -> Math.pow(a, b);
            default -> {
                System.out.println("Invalid operator");
                yield 0;
            }
        };
        System.out.println("Result: " + result);
        scanner.close();
    }
}
