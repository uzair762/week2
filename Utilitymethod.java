package P3;
import java.util.Scanner;

public class Utilitymethod {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static long multiply(int a, int b) { return (long) a * b; }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return (double) a / b;
    }
    public static int maxofThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt();

        System.out.println("Add: " + add(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));

        System.out.print("Enter third number for max: ");
        int c = scanner.nextInt();
        System.out.println("Max of three: " + maxofThree(a, b, c));

        System.out.print("Enter number to check prime: ");
        int n = scanner.nextInt();
        System.out.println(n + " is prime? " + isPrime(n));

        scanner.close();
    }
}

