import java.util.ArrayList;

public class Task2_2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Amal");
        employees.add("Nimal");
        employees.add("Kamal");
        employees.add("Saman");
        employees.add("Sunil");

        System.out.println("Original List: " + employees);

        // Delete by value
        employees.remove("Kamal");
        System.out.println("After removing Kamal: " + employees);

        // Insert at the beginning
        employees.add(0, "Kasun");
        System.out.println("After adding Kasun at the beginning: " + employees);

        // Update an existing name
        employees.set(2, "Nimal Perera");
        System.out.println("After correcting the name: " + employees);
    }
}
