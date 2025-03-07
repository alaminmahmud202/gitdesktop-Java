import java.util.Scanner;

public class SumFunction {
    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
