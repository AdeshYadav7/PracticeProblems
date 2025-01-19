import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("Input two numbers to find their sum:");
        try (Scanner input = new Scanner(System.in)) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int total = num1 + num2;
            System.out.println("The total is: " + total);
        }
    }
}
