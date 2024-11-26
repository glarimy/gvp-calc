import java.util.Scanner;

public class FibonacciSeries {
    public void  Fib() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the maximum number
        System.out.print("Enter the maximum number for the Fibonacci series: ");
        int maxNumber = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci Series up to " + maxNumber + ":");

        // Print Fibonacci series up to the maximum number
        while (num1 <= maxNumber) {
            System.out.print(num1 + " ");
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
        
        scanner.close();
    }
}
