import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("What is your Name:");

       String name = scanner.nextLine();


       System.out.println("What is Your age:");

       int age = scanner.nextInt();

              System.out.println("What is Your gpa:");
            double gpa = scanner.nextDouble();

       System.out.println("User name is " + name);

       System.out.println("User age is " + age);
              System.out.println("User gpa is " + gpa);


        scanner.close();

    }
}