import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        System.out.println("Input radius and height of the cylinder:");
        try (Scanner scanner = new Scanner(System.in)) {
            int radius = scanner.nextInt();
            int height = scanner.nextInt();
            double volume = Math.PI * radius * radius * height;
            System.out.println("Volume of the cylinder: " + volume);
        }
    }
}
