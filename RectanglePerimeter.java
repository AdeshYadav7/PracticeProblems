import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        System.out.println("Input the length and width of the rectangle:");
        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            int perimeter = 2 * (length + width);
            System.out.println("Rectangle Perimeter: " + perimeter);
        }
    }
}
