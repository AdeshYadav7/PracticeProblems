import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter principal, rate, and time:");
        try (Scanner scanner = new Scanner(System.in)) {
            int principal = scanner.nextInt();
            int rate = scanner.nextInt();
            int time = scanner.nextInt();
            double interest = (principal * rate * time) / 100.0;
            System.out.println("Calculated Simple Interest: " + interest);
        }
    }
}
