import java.util.LinkedList;

public class Task1_3 {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Colombo");
        cities.add("Kandy");
        cities.add("Galle");
        cities.add("Jaffna");
        cities.add("Matara");

        System.out.println("Original List: " + cities);

        cities.set(2, "Negombo");
        System.out.println("After updating index 2: " + cities);

        cities.remove("Jaffna");
        System.out.println("After removing Jaffna: " + cities);
    }
}