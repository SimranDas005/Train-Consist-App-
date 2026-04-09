import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("==================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("==================================");

        // Create a dynamic List to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist: " + trainConsist);

        // System ready message
        System.out.println("System ready for operations...");
    }
}