import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your Name:");

        // String name = scanner.nextLine();

        // System.out.println("What is Your age:");

        // int age = scanner.nextInt();

        // System.out.println("What is Your gpa:");
        // double gpa = scanner.nextDouble();

        // System.out.println("User name is " + name);

        // System.out.println("User age is " + age);
        // System.out.println("User gpa is " + gpa);

        // Car car1 = new Car();
        // System.out.println(car1.name);
        // System.out.println(car1.isRunning);
        // car1.start();
        // System.out.println(car1.isRunning);
        // car1.stop();
        // System.out.println(car1.isRunning);

        // scanner.close();

        //contructor is special method to initialize a object . You can pass arguments to a constructor,
        //  and set up inital value
        // Student student1 = new Student("ayush",24);
        // Student student3 = new Student("raj",67);
        // System.out.println(student1.name);
        // System.out.println(student3.name);
        // student1.study();

    //     Cat cat = new Cat();
    //     Dog dog = new Dog();

    //    dog.start();
    //            cat.start();

    // Circle circle = new Circle(5);
    // Rectangle rect = new Rectangle();
       
    // circle.display();
    // rect.display();
    // System.out.println(circle.area());

        //  String a ="Ayush";
        //  String b ="Ayush";

        //  System.out.println(a == b);
        //     System.out.println(a.charAt(0));
        //        System.out.println(a.equals(b));

        // Student s = new Student("Ayush", 23);

        // s.display();
        String num ="74206";

         for(int i=num.length()-1;i>=0;i--){
          if((num.charAt(i)-'0')%2 ==1){
            System.out.println(num.charAt(i));
           System.out.println(num.substring(0,i+1));
           // return;
          }
        }
        System.out.println("");
        
    }
}