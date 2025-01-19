import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        System.out.println("Input three numbers to find their average:");
        try (Scanner scanner = new Scanner(System.in)) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            double average = (num1 + num2 + num3) / 3.0;
            System.out.println("Average: " + average);
        }
    }
}
