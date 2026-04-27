import import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * Use Case 8: Filter Passenger Bogies Using Streams
 * Description:
 * Filters bogies based on seating capacity using Stream API.
 *
 * @author Developer
 * @version 8.0
 */

public class Main {

    // Reusing Bogie model from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=========================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 Stream filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nUC8 filtering completed...");
    }
}