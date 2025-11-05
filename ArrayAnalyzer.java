
package P2;
import java.util.Scanner;
public class ArrayAnalyzer 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter number of elements (N): ");
        int N = scanner.nextInt();
        int[] numbers = new int[N];

       
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

      
        int sum = 0, min = numbers[0], max = numbers[0];
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        double average = (double) sum / N;

        System.out.println("\n--- Analysis ---");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);

    
        System.out.println("\nArray in Reverse Order:");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}