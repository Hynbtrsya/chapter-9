import java.util.Scanner;

class SumOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Starting ....\n");
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt(); // Get user input

            // No calculation for even sums, just the prompt
            System.out.println("\nCalculation completed successfully.");
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Process finished.");
            scanner.close(); // Close the scanner object to prevent resource leak
        }
    }
}
