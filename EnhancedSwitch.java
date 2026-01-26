import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       String day;
       System.out.print("Enter a day: ");
       day  =scanner.next();

       switch(day){
        case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
        System.out.println("This is a weekday");

        case "Saturday","Sunday" -> 
        System.out.println("This is weekend");

        default->System.out.println(day+" This is not a day.");

       }

    }
}
