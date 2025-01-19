import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        System.out.println("Enter base and exponent:");
        try (Scanner scanner = new Scanner(System.in)) {
            int base = scanner.nextInt();
            int exponent = scanner.nextInt();
            double result = Math.pow(base, exponent);
            System.out.println("Result: " + result);
        }
    }
}
