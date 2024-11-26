import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the cube of the number
        double cube = number * number * number;

        // Display the result
        System.out.println("The cube of " + number + " is " + cube);
        
        // Close the scanner
        scanner.close();
    }
}