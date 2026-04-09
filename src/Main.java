import java.util.LinkedHashSet;
import java.util.Set;

/**
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * Use Case 5: Preserve Insertion Order of Bogies
 * Description:
 * Maintains insertion order while preventing duplicate bogies using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */

public class Main {

    public static void main(String[] args) {

        // Display header
        System.out.println("=========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=========================================");

        // Create LinkedHashSet (ordered + unique)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // Note
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}