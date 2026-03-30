import java.util.*;


public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("UC3 Track Unique Bogie IDs");
        System.out.println();

        Set<String> bogies = new HashSet<>();

        bogies.add("86101");
        bogies.add("86102");
        bogies.add("86103");
        bogies.add("86104");

        bogies.add("86101");
        bogies.add("86102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...");
    }
}
