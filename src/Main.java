import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * Use Case 2: Add Passenger Bogies to Train
 * Description:
 * Demonstrates dynamic management of passenger bogies using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */

public class Main {

    public static void main(String[] args) {

        // Display header
        System.out.println("========================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("========================================");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ✅ Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ✅ Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ✅ Check if a bogie exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + hasSleeper);

        // ✅ Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}