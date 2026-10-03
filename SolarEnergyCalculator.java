
import java.util.scanner;
public class SolarEnergyCalculator {

    // Method to calculate the total energy generated
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the morning energy generation value from the user
        System.out.print("Enter morning energy generation (in kWh): ");
        double morning = input.nextDouble();

        // Read the evening energy generation value from the user
        System.out.print("Enter evening energy generation (in kWh): ");
        double evening = input.nextDouble();

        // Call the method to compute the total energy
        double totalEnergy = calculateTotalEnergy(morning, evening);

        // Display the total energy generated
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

        input.close();
    }
}
