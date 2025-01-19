import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter the circle's radius:");
        try (Scanner scanner = new Scanner(System.in)) {
            int radius = scanner.nextInt();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of the circle: " + area);
        }
    }
}
