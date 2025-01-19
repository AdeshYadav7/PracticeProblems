import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Provide temperature in Celsius:");
        try (Scanner sc = new Scanner(System.in)) {
            int celsius = sc.nextInt();
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
    }
}
