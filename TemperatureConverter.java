import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        String unit;
        double newTemp;

        System.out.print("Enter the Temperature : ");
        temp = scanner.nextDouble();

         
        System.out.print("Covert to Celsius or Fahrenheit? (C or F):  ");
        unit = scanner.next().toUpperCase();
      
        newTemp = (unit.equals("C") ) ? (temp-32)*5/9 :(temp*9/5)+32;

        System.out.printf("%.1f%s ", newTemp,unit);
          scanner.close();

    }
}
