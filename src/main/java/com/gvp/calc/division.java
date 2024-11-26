public class Division {
    public static void main(String[] args) {
        // Declare two numbers
        double num1 = 10;
        double num2 = 2;

        // Check if the divisor is not zero
        if (num2 != 0) {
            // Perform division
            double result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
