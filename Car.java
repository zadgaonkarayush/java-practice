public class Car {
    String model ="Ford";
    String name = "Mustang";
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
     System.out.println("Engine start!");
     isRunning = true;
    }
     void stop(){
     System.out.println("Engine stop!");
     isRunning = false;
    }
}
