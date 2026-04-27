import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - UseCase9TrainConsistMgmt
 * Use Case 9: Group Bogies by Type
 * Description:
 * Groups bogies using Stream API and Collectors.groupingBy()
 *
 * @author Developer
 * @version 9.0
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
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("=========================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Display input
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // 🔥 Grouping using Stream API
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            entry.getValue().forEach(System.out::println);
        }

        System.out.println("\nUC9 grouping completed...");
    }
}