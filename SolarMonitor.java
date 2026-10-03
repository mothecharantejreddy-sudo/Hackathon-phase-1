 import java.util.Scanner;

public class SolarMonitor {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the energy generated
        System.out.print("Enter the energy generated in kWh: ");
        double energyGenerated = scanner.nextDouble();
        
        // Check the condition using an if-else statement
        if (energyGenerated >= 10.0) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
        
        // Close the scanner
        scanner.close();
    }
}

