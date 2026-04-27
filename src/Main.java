import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * Use Case 10: Count Total Seats in Train
 * Description:
 * Aggregates seating capacity of all bogies using Stream reduce()
 *
 * @author Developer
 * @version 10.0
 */

public class Main {

    // Reusing Bogie model
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
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("=========================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display bogies
        System.out.println("\nBogies in Train:");
        bogies.forEach(System.out::println);

        // 🔥 Aggregation using reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 aggregation completed...");
    }
}