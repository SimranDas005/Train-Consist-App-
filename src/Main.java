import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * Use Case 3: Track Unique Bogie IDs
 * Description:
 * Ensures duplicate bogie IDs are not added using HashSet.
 *
 * @author Developer
 * @version 3.0
 */

public class Main {

    public static void main(String[] args) {

        // Display header
        System.out.println("========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("========================================");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Display results
        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogies);

        // Note about uniqueness
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}