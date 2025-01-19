import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        System.out.println("Input distance in kilometers:");
        try (Scanner scanner = new Scanner(System.in)) {
            int kilometers = scanner.nextInt();
            double miles = kilometers * 0.621371;
            System.out.println("Equivalent distance in miles: " + miles);
        }
    }
}
