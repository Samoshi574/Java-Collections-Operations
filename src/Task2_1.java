import java.util.ArrayList;

public class Task2_1 {
    public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(100.50);
        prices.add(200.75);
        prices.add(300.25);
        prices.add(400.00);
        prices.add(500.50);

        System.out.println("Original List: " + prices);

        // Insert a new price in the middle
        prices.add(2, 250.00);
        System.out.println("After inserting 250.00: " + prices);

        // Remove an element using index
        prices.remove(3);
        System.out.println("After removing index 3: " + prices);

        // Update a value using set()
        prices.set(1, 220.00);
        System.out.println("After updating index 1: " + prices);
    }
}
